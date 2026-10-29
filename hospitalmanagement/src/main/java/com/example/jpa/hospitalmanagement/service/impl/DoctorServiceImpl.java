package com.example.jpa.hospitalmanagement.service.impl;
import com.example.jpa.hospitalmanagement.dto.DoctorRequestDto;
import com.example.jpa.hospitalmanagement.dto.DoctorResponseDto;
import com.example.jpa.hospitalmanagement.exception.DoctorNotFoundException;
import com.example.jpa.hospitalmanagement.entity.Doctor;
import com.example.jpa.hospitalmanagement.repository.DoctorRepository;
import com.example.jpa.hospitalmanagement.service.DoctorService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{
    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }
    @Override
//    public Doctor saveDoctor(Doctor doctor)
//
//    {
//        return doctorRepository.save(doctor);
//    }

    public DoctorResponseDto saveDoctor(DoctorRequestDto requestDto){
           Doctor doctor = new Doctor();
           doctor.setName(requestDto.getName());
           doctor.setSpecialization(requestDto.getSpecialization());
           doctor.setExperience(requestDto.getExperience());

           Doctor savedDoctor = doctorRepository.save(doctor);
        DoctorResponseDto response = new DoctorResponseDto();
        response.setId(savedDoctor.getId());
        response.setName(savedDoctor.getName());
        response.setSpecialization(savedDoctor.getSpecialization());
        response.setExperience(savedDoctor.getExperience());
        return response;
    }

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(Long id){
        return doctorRepository.findById(id).orElseThrow(()-> new DoctorNotFoundException("Doctor not found"));
    }
}