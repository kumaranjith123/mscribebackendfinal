package com.example.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MedicinePrescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regId;

    private String medicineName;
    private Double dosage;
    private Double dose;
    private String frequency;
    private Long duration;
    private String consumption;
    private String addAdvice;
    private Date followupDetails;
}
