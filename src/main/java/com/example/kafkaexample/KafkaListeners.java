package com.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


    @KafkaListener(topics = "topic1", groupId = "group_id")
    void listener(String data) {
        System.out.println("Recibido: " + data);
    }

}
