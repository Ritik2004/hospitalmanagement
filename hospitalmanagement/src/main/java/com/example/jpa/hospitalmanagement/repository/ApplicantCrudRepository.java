package com.example.jpa.hospitalmanagement.repository;

import com.example.jpa.hospitalmanagement.entity.Applicant;
import org.springframework.data.repository.CrudRepository;

public interface ApplicantCrudRepository extends CrudRepository<Applicant,Long> {

}
