package com.example.controller;

import org.springframework.web.bind.annotation.*;

import com.example.entity.BasicPatientInfo;
import com.example.service.BasicPatientInfoService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/patients/basic")
public class BasicPatientInfoController {

    private final BasicPatientInfoService service;

    public BasicPatientInfoController(BasicPatientInfoService service) {
        this.service = service;
    }

    @PostMapping
    public BasicPatientInfo create(@RequestBody BasicPatientInfo info) {
        return service.create(info);
    }

    @GetMapping("/{regId}")
    public BasicPatientInfo getByRegId(@PathVariable("regId") Long regId) {
        return service.getByRegId(regId);
    }
}
