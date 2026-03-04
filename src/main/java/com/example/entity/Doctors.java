package com.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Doctors 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long regId;
	private String doctorName;
	private String doctorId;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	
}
