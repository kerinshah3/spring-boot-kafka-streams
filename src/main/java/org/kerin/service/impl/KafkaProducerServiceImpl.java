package org.kerin.service.impl;

import org.kerin.model.KafkaMessage;
import org.kerin.service.KafkaProducerService;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {

    @Override
    public void sendKafkaMessage(KafkaMessage kafkaMessage) {

    }
}
