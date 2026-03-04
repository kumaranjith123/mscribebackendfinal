package com.example.controller;

import com.example.entity.Medicine;
import com.example.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicines")
@CrossOrigin("*")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping
    public Medicine addMedicine(@RequestBody Medicine medicine) {
        return medicineService.saveMedicine(medicine);
    }

    @GetMapping
    public List<Medicine> searchMedicines(
            @RequestParam(required = false) String name) {

        if (name != null && !name.isEmpty()) {
            return medicineService.searchByName(name);
        }

        return medicineService.getAllMedicines();
    }
}