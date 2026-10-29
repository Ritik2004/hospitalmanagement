package com.example.jpa.hospitalmanagement.service;

import com.example.jpa.hospitalmanagement.dto.DoctorRequestDto;
import com.example.jpa.hospitalmanagement.dto.DoctorResponseDto;
import com.example.jpa.hospitalmanagement.entity.Doctor;

import java.util.List;

public interface DoctorService {

    DoctorResponseDto saveDoctor(DoctorRequestDto requestDto);

    List<Doctor> getAllDoctors();

    Doctor getDoctorById(Long id);
}