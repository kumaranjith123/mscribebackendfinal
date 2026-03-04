package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Patients;

import java.util.Optional;

public interface PatientsRepository extends JpaRepository<Patients, Long>{

    Optional<Patients> findByPhone(String phone);
}
