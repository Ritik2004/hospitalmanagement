package com.example.jpa.hospitalmanagement.exception;

public class DoctorNotFoundException extends RuntimeException{
    public DoctorNotFoundException(String message){
        super(message);
    }
}