package com.example.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.entity.Doctors;
import com.example.repository.DoctorsRepository;

@Service
public class DoctorsService {

    private final DoctorsRepository doctorsRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public DoctorsService(DoctorsRepository doctorsRepository) {
        this.doctorsRepository = doctorsRepository;
    }

    // 🔐 Registration
    public Doctors createPatient(Doctors doctor) {
        doctor.setPassword(passwordEncoder.encode(doctor.getPassword()));
        return doctorsRepository.save(doctor);
    }


    public Doctors login(String doctorId, String password) {

        Doctors doctor = doctorsRepository
                .findByDoctorId(doctorId)
                .orElse(null);

        if (doctor != null &&
                passwordEncoder.matches(password, doctor.getPassword())) {
            return doctor;
        }

        return null;
    }
}