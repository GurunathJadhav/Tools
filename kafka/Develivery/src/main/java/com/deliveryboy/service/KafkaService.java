package com.deliveryboy.service;

import com.deliveryboy.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public boolean update(String location){
        kafkaTemplate.send(AppConstants.TOPIC_NAME,location);
        return true;
    }

}
