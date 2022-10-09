package com.eatnuh.springdatakafka.controller;

import com.eatnuh.springdatakafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/send")
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping
    public String sendMessage(@RequestBody String message) {
        kafkaProducerService.sendMessage(message);
        return "success";
    }
}
