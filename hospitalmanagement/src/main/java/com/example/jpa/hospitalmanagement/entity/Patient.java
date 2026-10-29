
package com.example.jpa.hospitalmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.Index;
import jakarta.persistence.Column;
import org.hibernate.annotations.CreationTimestamp;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "patient",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "unique_patient_email",
                        columnNames = {"email"}
                )
        },
        indexes = {
                @Index(
                        name = "idx_patient_birth_date",
                        columnList = "birthDate"
                )
        }
)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length=40)

    private String name;
    private LocalDate birthDate;

    @Column(nullable = false, unique = true)
    private String email;

    private String gender;

    @CreationTimestamp
    @Column(updatable=false)
    private LocalDateTime createdAt;
    @Column(name = "blood_group")
    private String bloodGroup;

}
