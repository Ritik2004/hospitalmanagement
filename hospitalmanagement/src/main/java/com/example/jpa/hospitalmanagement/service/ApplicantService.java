package com.example.jpa.hospitalmanagement.service;

import com.example.jpa.hospitalmanagement.entity.Applicant;
import com.example.jpa.hospitalmanagement.repository.ApplicantCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class ApplicantService {

    @Autowired
    private ApplicantCrudRepository applicantCrudRepository;
    public List<Applicant> getApplicants(){
        return (List<Applicant>) applicantCrudRepository.findAll();
    }

    public Applicant saveApplicantcrud(Applicant applicant){

        return applicantCrudRepository.save(applicant);

    }

}