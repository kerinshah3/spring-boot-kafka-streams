package org.kerin.service.impl;

import org.kerin.model.KafkaMessage;
import org.kerin.model.MessagePayload;
import org.kerin.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, MessagePayload> kafkaTemplate;

    @Override
    public void sendKafkaMessage(KafkaMessage kafkaMessage) {
        kafkaTemplate.send(kafkaMessage.getMessageMetadata().getTopic(),kafkaMessage.getMessagePayload());
    }
}
