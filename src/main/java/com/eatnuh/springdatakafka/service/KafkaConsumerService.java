package com.eatnuh.springdatakafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "MESSAGE", groupId = "foo")
    public void consume(String message) {
        System.out.println("receive message : " + message);
    }
}
