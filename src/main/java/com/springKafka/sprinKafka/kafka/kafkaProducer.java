package com.springKafka.sprinKafka.kafka;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;
@Service
public class kafkaProducer {
    private KafkaTemplate<String,String> kafkaTemplate;
    private static final Logger LOGGER= LoggerFactory.getLogger(kafkaProducer.class);

    public kafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        LOGGER.info(String.format("Message sent %s",message));
        kafkaTemplate.send("RSDTopic",message);
    }
}
