package org.kerin.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.kerin.model.KafkaMessage;
import org.kerin.model.MessagePayload;
import org.kerin.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducerServiceImpl implements KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, MessagePayload> kafkaTemplate;

    @Override
    public void sendKafkaMessage(KafkaMessage kafkaMessage) {

        kafkaTemplate.send(kafkaMessage.getMessageMetadata().getTopic(),kafkaMessage.getMessagePayload());
    }
}
