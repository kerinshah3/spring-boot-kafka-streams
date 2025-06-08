package org.kerin.web;


import org.kerin.model.KafkaMessage;
import org.kerin.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("v1")
public class KafkaProducerController {

    @Autowired
    KafkaProducerService kafkaProducerService;

    @PostMapping("send-kafka-message")
    public void sendKafkaMessage(@RequestBody KafkaMessage kafkaMessage){
        this.kafkaProducerService.sendKafkaMessage(kafkaMessage);
    }

}
