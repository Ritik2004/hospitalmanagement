package com.example.jpa.hospitalmanagement.repository;

import com.example.jpa.hospitalmanagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
