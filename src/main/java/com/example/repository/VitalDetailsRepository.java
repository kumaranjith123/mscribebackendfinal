package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.VitalDetails;

public interface VitalDetailsRepository extends JpaRepository<VitalDetails, Long> {
}
