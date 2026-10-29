package com.example.jpa.hospitalmanagement.repository;

import com.example.jpa.hospitalmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsernameAndIsActive(String username, boolean isActive);

}