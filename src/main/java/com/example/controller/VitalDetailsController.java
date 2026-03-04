package com.example.controller;

import org.springframework.web.bind.annotation.*;
import com.example.entity.VitalDetails;
import com.example.service.VitalDetailsService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/vitals")
public class VitalDetailsController {

    private final VitalDetailsService service;

    public VitalDetailsController(VitalDetailsService service) {
        this.service = service;
    }

    @PostMapping
    public VitalDetails create(@RequestBody VitalDetails vitalDetails) {
        return service.createVitalDetails(vitalDetails);
    }

    @GetMapping("/{regId}")
    public VitalDetails getById(@PathVariable("regId") Long regId) {
        return service.getVitalDetailsById(regId);
    }
}
