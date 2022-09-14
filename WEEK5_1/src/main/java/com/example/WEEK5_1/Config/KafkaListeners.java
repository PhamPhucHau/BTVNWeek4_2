package com.example.WEEK5_1.Config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics="likelion",
            groupId="groupId"
    )
    void listener(String data)
    {
        System.out.println("Listen received "+ data+":)");
    }
}
