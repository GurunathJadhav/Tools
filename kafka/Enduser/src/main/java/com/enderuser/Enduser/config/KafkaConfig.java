package com.enderuser.Enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {


    @KafkaListener(topics = AppConstants.TOPIC_NAME,groupId = AppConstants.GROUP_ID)
    public void updatedLocation(String location){
        System.out.println(location);
    }
}
