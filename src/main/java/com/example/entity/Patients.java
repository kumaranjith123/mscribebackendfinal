package com.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patients {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long regId;
  @Column(name = "patients_name")
	private String name;

  @Column(name = "patient_phone_number")
	private String phone;

  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  @Column(name = "password")
	private String password;
}
