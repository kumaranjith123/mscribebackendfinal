package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Doctors;

public interface DoctorsRepository extends JpaRepository<Doctors, Long>{
	Optional<Doctors> findByDoctorId(String doctorId);
}
