package com.crumb.backend.controller;

import com.crumb.backend.model.Donut;
import com.crumb.backend.repository.DonutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donuts")
@CrossOrigin(origins = "*")
public class DonutController {

    @Autowired
    private DonutRepository donutRepository;

    @GetMapping
    public List<Donut> getAllDonuts() {
        return donutRepository.findAll();
    }

    @PostMapping
    public Donut addDonut(@RequestBody Donut donut) {
        return donutRepository.save(donut);
    }
}
