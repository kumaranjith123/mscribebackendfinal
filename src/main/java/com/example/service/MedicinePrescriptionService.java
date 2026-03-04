package com.example.service;

import org.springframework.stereotype.Service;
import com.example.entity.MedicinePrescription;
import com.example.repository.MedicinePrescriptionRepository;

@Service
public class MedicinePrescriptionService {

    private final MedicinePrescriptionRepository repository;

    public MedicinePrescriptionService(MedicinePrescriptionRepository repository) {
        this.repository = repository;
    }

    public MedicinePrescription createPrescription(MedicinePrescription prescription) {
        return repository.save(prescription);
    }

    public MedicinePrescription getByRegId(Long regId) {
        return repository.findById(regId)
                .orElseThrow(() -> 
                    new RuntimeException("Prescription not found for regId: " + regId));
    }
}
