package com.example.controller;

import com.example.entity.Doctors;
import com.example.service.DoctorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/doctors")
public class DoctorsController {

	@Autowired
	private DoctorsService doctorsService;

	@PostMapping("/registration")
	public Doctors createPatient(@RequestBody Doctors doctor) {
		return doctorsService.createPatient(doctor);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(
			@RequestParam String doctorId,
			@RequestParam String password) {

		Doctors doctor = doctorsService.login(doctorId, password);

		if (doctor == null) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
					.body("Invalid credentials");
		}

		return ResponseEntity.ok(doctor);
	}
}