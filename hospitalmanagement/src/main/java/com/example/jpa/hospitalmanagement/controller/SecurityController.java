package com.example.jpa.hospitalmanagement.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class SecurityController{
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/hey")
    public String hey(){
        return "Hey World";
    }
    @GetMapping("/hi")
    public String hi(){
        return "Hi World";
    }
}