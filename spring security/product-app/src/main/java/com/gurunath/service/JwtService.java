package com.gurunath.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtService {

    @Value("${security.secret-key}")
    private String secret_key;

    @Value("${security.issuer}")
    private String issuer;

    @Value("${security.expiration-time}")
    private int expiration_time;

    private Algorithm algorithm;

    @PostConstruct
    private void postConstruct(){
        algorithm=Algorithm.HMAC256(secret_key);
    }

    public String generateToken(String username,String role){
       return JWT.create()
                .withIssuer(issuer)
                .withClaim("username",username)
                .withClaim("role",role)
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis()+expiration_time))
                .sign(algorithm);
    }





}
