package org.kerin.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.kerin.model.MessagePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.serializer.JsonSerde;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class KafkaErrorStreamsServiceImpl {

    @Autowired
    public void kafkaErrorStreams(StreamsBuilder streamsBuilder){
        KStream<String, MessagePayload> errorStream = streamsBuilder.stream("ks.error",
                Consumed.with(Serdes.String(),new JsonSerde<>(MessagePayload.class)));

        errorStream.foreach((key,value) -> log.info("Message received for requestId {}: {}",value.getRequestId(),value));
    }

}
