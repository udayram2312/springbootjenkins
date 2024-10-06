package com.neoteric.springdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(value = "/dockerDemo")
    public String helloWorld() {
        return "First demo on Minikube";
    }
}