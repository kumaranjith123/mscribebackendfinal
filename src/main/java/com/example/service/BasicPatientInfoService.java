package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.BasicPatientInfo;
import com.example.repository.BasicPatientInfoRepository;

@Service
public class BasicPatientInfoService {

    private final BasicPatientInfoRepository repository;

    public BasicPatientInfoService(BasicPatientInfoRepository repository) {
        this.repository = repository;
    }

    public BasicPatientInfo create(BasicPatientInfo info) {
        return repository.save(info);
    }

    public BasicPatientInfo getByRegId(Long regId) {
        return repository.findById(regId)
                .orElseThrow(() ->
                        new RuntimeException("Patient not found with regId: " + regId));
    }
}
