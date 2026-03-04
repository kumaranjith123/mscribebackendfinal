package com.example.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "basic_patient_info")
public class BasicPatientInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reg_id")
    private Long regId;

    private String patientName;
    private String gender;
    private long patientAge;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Temporal(TemporalType.DATE)
    @Column(name = "visit_date")
    private Date date;

    private long patientId;
    private long patientContact;
    private String patientEmailId;
    private String patientAddress;
}
