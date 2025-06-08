package org.kerin.service;

import org.kerin.model.KafkaMessage;

public interface KafkaProducerService {

    void sendKafkaMessage(KafkaMessage kafkaMessage);

}
