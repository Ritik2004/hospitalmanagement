package com.example.jpa.hospitalmanagement.controller;

import com.example.jpa.hospitalmanagement.dto.UserRequestDto;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/validation")
public class ValidationController{

    @PostMapping
    public String ValidateUser(@Valid @RequestBody UserRequestDto userRequestDto){
        return "Validation Successful";
    }
}