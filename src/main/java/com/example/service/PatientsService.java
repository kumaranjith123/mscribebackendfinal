package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.entity.Patients;
import com.example.repository.PatientsRepository;

import java.util.List;

@Service
public class PatientsService {
     @Autowired
     private PatientsRepository patientsRepository;
     @Autowired
     private PasswordEncoder passwordEncoder;

     public Patients addPatients(Patients patients) {
          patients.setPassword(
                  passwordEncoder.encode(patients.getPassword())
          );

          return patientsRepository.save(patients);
     }

     public Patients login(String phone, String password) {

          Patients patient = patientsRepository
                  .findByPhone(phone)
                  .orElseThrow(() -> new RuntimeException("User not found"));

          if (!passwordEncoder.matches(password, patient.getPassword())) {
               throw new RuntimeException("Invalid credentials");
          }

          return patient;
     }


     public List<Patients> getAllPatients() {
          return patientsRepository.findAll();

     }

}
