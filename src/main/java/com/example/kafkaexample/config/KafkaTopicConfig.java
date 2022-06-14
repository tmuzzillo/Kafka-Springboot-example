package com.example.kafkaexample.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {


    //Creamos un nuevo topico
    @Bean
    public NewTopic topic1(){
        return TopicBuilder.name("topic1").build();
    }

}
