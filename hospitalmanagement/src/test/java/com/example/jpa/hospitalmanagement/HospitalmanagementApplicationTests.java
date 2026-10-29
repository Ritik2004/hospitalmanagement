
package com.example.jpa.hospitalmanagement;

import com.example.jpa.hospitalmanagement.entity.Doctor;
import com.example.jpa.hospitalmanagement.repository.DoctorRepository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@SpringBootTest
class HospitalmanagementApplicationTests {

	@Autowired
	private DoctorRepository doctorRepository;

	@Test
	void contextLoads() {
		List<Doctor> doctors = doctorRepository.findAll();
		System.out.println(doctors);
	}
}
