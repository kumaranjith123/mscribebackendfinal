package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Patients;
import com.example.service.PatientsService;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/patients")
public class PatientsController 
{
	@Autowired
    private PatientsService patientsService;
	@GetMapping
	public List<Patients> getAllDetails () {
		return patientsService.getAllPatients();

	}
	 @PostMapping("/registration")
	    public Patients addPatients(@RequestBody Patients patients) {
	        return patientsService.addPatients(patients);
	    }
}
