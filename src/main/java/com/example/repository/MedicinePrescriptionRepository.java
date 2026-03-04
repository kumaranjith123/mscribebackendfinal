package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.MedicinePrescription;

public interface MedicinePrescriptionRepository 
        extends JpaRepository<MedicinePrescription, Long> {
}
