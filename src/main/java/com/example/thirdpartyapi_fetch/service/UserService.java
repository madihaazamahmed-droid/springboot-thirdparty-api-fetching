package com.example.thirdpartyapi_fetch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.thirdpartyapi_fetch.dto.User;

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;
    String url = "https://jsonplaceholder.typicode.com/users/3";

    public User getUser() {
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }
}
