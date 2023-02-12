package com.springKafka.sprinKafka.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springKafka.sprinKafka.kafka.JsonKafkaProducer;
import com.springKafka.sprinKafka.payload.User;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/kafka")
public class JsonMessageController {
    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    @PostMapping("publish")
    public ResponseEntity<String> publish(@RequestBody User user) throws JsonProcessingException {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json Message sent successfully");
    }
}
