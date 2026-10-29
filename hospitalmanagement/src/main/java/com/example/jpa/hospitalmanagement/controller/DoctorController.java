package com.example.jpa.hospitalmanagement.controller;

import com.example.jpa.hospitalmanagement.dto.DoctorRequestDto;
import com.example.jpa.hospitalmanagement.dto.DoctorResponseDto;
import com.example.jpa.hospitalmanagement.entity.Doctor;
import com.example.jpa.hospitalmanagement.service.DoctorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/doctors")
public class DoctorController {
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
//    public Doctor saveDoctor(@RequestBody Doctor doctor) {
//        return doctorService.saveDoctor(doctor);
//    }
     public DoctorResponseDto saveDoctor(@RequestBody DoctorRequestDto requestDto){
        return doctorService.saveDoctor(requestDto);
    }
    @GetMapping
    public List<Doctor> getAlldoctors(){
        return doctorService.getAllDoctors();
    }
    @GetMapping("/{id}")
        public Doctor getDoctorById(@PathVariable Long id){
          return doctorService.getDoctorById(id);
    }
}