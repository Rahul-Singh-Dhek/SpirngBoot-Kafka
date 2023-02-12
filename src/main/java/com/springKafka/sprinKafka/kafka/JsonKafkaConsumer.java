package com.springKafka.sprinKafka.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springKafka.sprinKafka.payload.User;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics="RSDJsonTopic",groupId = "myGroup")
    public void consume(String user) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user1=objectMapper.readValue(user, User.class);
        LOGGER.info(String.format("Json Message received -> %s",user1.toString()));
    }
}
