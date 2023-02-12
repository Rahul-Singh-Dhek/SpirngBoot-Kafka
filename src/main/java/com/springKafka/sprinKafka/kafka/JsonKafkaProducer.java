package com.springKafka.sprinKafka.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springKafka.sprinKafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaProducer.class);
    private KafkaTemplate<String, User> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User data) throws JsonProcessingException {
        LOGGER.info(String.format("Json Message Sent-> %s", data.toString()));
        ObjectMapper objectMapper = new ObjectMapper();
        String UserAsString=objectMapper.writeValueAsString(data);
        Message<String> message= MessageBuilder.withPayload(UserAsString).setHeader(KafkaHeaders.TOPIC,"RSDJsonTopic").build();
        kafkaTemplate.send(message);
    }
}
