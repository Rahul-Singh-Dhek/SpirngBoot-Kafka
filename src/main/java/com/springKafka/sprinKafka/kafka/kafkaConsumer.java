package com.springKafka.sprinKafka.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springKafka.sprinKafka.module.MentorModel;
import com.springKafka.sprinKafka.module.MentorModel1;
import com.springKafka.sprinKafka.payload.User;
import com.springKafka.sprinKafka.repository.MentorRepository;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {
    @Autowired
    MentorRepository mentorRepository;
    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics="RSDTopic",groupId = "myGroup")
    public void consume(String message){
        LOGGER.info(String.format("Message received ->%s",message));
    }
    @KafkaListener(topics="demo",groupId = "myGroup")
    public void consume2(String message) throws JsonProcessingException {
//        LOGGER.info(String.format("Message received ->%s",message));
        ObjectMapper objectMapper = new ObjectMapper();
        MentorModel csvDoc=objectMapper.readValue(message, MentorModel.class);
//        System.out.println(csvDoc.toString());
        LOGGER.info(mentorRepository.save(csvDoc).toString());
    }

}
