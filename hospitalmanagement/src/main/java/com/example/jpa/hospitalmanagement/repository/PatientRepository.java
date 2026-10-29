package com.example.jpa.hospitalmanagement.repository;

import com.example.jpa.hospitalmanagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}