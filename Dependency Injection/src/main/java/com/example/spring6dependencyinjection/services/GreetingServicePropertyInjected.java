package com.example.spring6dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends dont let friends do property injection";
    }
}
