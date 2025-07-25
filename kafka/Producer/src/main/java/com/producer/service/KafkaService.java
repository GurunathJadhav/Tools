package com.producer.service;


import com.producer.config.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private Logger logger= LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location){
        kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME,location);
        return true;
    }
}
