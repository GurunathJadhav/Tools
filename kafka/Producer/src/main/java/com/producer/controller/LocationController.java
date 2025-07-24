package com.producer.controller;

import com.producer.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        for (int i=0;i<100000;i++){

        kafkaService.updateLocation("( "+Math.round(Math.random()*1000)+"."+Math.floor(Math.random()*1000)+"."+Math.floor(Math.random()*1000)+"."+Math.floor(Math.random()*1000)+" , "+Math.round(Math.random()*100)+"."+Math.floor(Math.random()*1000)+"."+Math.floor(Math.random()*1000)+"."+Math.floor(Math.random()*1000)+" )");
        }
        return ResponseEntity.ok(Map.of("Message","Location Updated"));
    }
}
