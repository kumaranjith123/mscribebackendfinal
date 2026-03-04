package com.example.controller;

import org.springframework.web.bind.annotation.*;

import com.example.entity.MedicinePrescription;
import com.example.service.MedicinePrescriptionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/prescriptions")
public class MedicinePrescriptionController {

    private final MedicinePrescriptionService service;

    public MedicinePrescriptionController(MedicinePrescriptionService service) {
        this.service = service;
    }

    @PostMapping
    public MedicinePrescription create(
            @RequestBody MedicinePrescription prescription) {
        return service.createPrescription(prescription);
    }

    @GetMapping("/{regId}")
    public MedicinePrescription getById(
            @PathVariable("regId") Long regId) {
        return service.getByRegId(regId);
    }
}
