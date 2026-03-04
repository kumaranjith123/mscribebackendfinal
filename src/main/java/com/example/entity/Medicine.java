package com.example.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "medicines")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "medicine_name",nullable = false)
    private String medicineName;

    // Getter
    public String getMedicineName() {
        return medicineName;
    }

    // Setter
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

}
