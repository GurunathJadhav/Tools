package com.deliveryboy.controller;

import com.deliveryboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;


    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        for(int i=0;i<100000;i++){
            String location="( "+Math.floor(Math.random()*1000)+"."+Math.floor(Math.random()*1000)+"."+Math.floor(Math.random()*1000)+"."+Math.floor(Math.random()*1000)+" ,"+
                    Math.floor(Math.random()*1000)+"."+Math.floor(Math.random()*1000)+"."+Math.floor(Math.random()*1000)+"."+Math.floor(Math.random()*1000)+" )";
            kafkaService.update(location);
        }

        return ResponseEntity.ok(Map.of("message","Location Updated.."));
    }
}
