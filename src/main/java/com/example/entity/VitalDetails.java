package com.example.entity;

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
public class VitalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regId;

    private double bloodPressure;
    private double weight;
    private double pulseRate;
    private double height;
    private double temperature;
}
