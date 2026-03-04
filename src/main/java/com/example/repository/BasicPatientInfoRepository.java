package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.BasicPatientInfo;

public interface BasicPatientInfoRepository
        extends JpaRepository<BasicPatientInfo, Long> {
}
