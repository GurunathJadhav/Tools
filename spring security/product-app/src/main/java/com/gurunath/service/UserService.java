package com.gurunath.service;

import com.gurunath.entity.UserPerson;
import com.gurunath.payload.UserPersonRequest;
import com.gurunath.repository.UserPersonRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private UserPersonRepository userPersonRepository;
    private PasswordEncoder passwordEncoder;

    public UserService(UserPersonRepository userPersonRepository, PasswordEncoder passwordEncoder) {
        this.userPersonRepository = userPersonRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Map<String,String> registerUser(UserPersonRequest userPersonRequest){
        UserPerson user=new UserPerson();
        user.setName(userPersonRequest.getName());
        user.setEmail(userPersonRequest.getEmail());
        user.setRole(userPersonRequest.getRole());
        user.setPassword(passwordEncoder.encode(userPersonRequest.getPassword()));
        UserPerson save = userPersonRepository.save(user);

        Map<String,String> response=new HashMap<>();
        String status=save!=null?"Register Successfully":"Failed to register";
        response.put("status",status);
        return response;

    }
}
