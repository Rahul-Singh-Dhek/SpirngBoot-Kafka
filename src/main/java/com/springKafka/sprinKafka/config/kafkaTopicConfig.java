package com.springKafka.sprinKafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {
    @Bean
    public NewTopic javaListTopic(){
        return TopicBuilder.name("RSDTopic")
                .build();
    }
    @Bean
    public NewTopic javaJsonTopic(){
        return TopicBuilder.name("RSDJsonTopic")
                .build();
    }
}
