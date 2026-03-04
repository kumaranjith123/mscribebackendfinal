package com.example.service;

import org.springframework.stereotype.Service;
import com.example.entity.VitalDetails;
import com.example.repository.VitalDetailsRepository;

@Service
public class VitalDetailsService {

    private final VitalDetailsRepository repository;

    public VitalDetailsService(VitalDetailsRepository repository) {
        this.repository = repository;
    }

    public VitalDetails createVitalDetails(VitalDetails vitalDetails) {
        return repository.save(vitalDetails);
    }

    public VitalDetails getVitalDetailsById(Long regId) {
        return repository.findById(regId)
                .orElseThrow(() -> new RuntimeException(
                        "Vital details not found for regId: " + regId));
    }
}
