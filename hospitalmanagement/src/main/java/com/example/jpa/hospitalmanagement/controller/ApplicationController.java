package com.example.jpa.hospitalmanagement.controller;

import com.example.jpa.hospitalmanagement.entity.Applicant;
import com.example.jpa.hospitalmanagement.service.ApplicantService;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
@Profile("applicant")
public class ApplicationController {

    private final ApplicantService applicantService;

    public ApplicationController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping
    public List<Applicant> getAllApplicants() {
        return applicantService.getApplicants();
    }

    @PostMapping
    public Applicant saveApplicant(@RequestBody Applicant applicant) {
        return applicantService.saveApplicantcrud(applicant);
    }
}