package com.projedata.factoryoptimizer.controller;

import com.projedata.factoryoptimizer.model.RawMaterial;
import com.projedata.factoryoptimizer.repository.RawMaterialRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/raw-materials")
public class RawMaterialController {

    private final RawMaterialRepository repository;

    public RawMaterialController(RawMaterialRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<RawMaterial> list() {
        return repository.findAll();
    }

    @PostMapping
    public RawMaterial create(@RequestBody RawMaterial rawMaterial) {
        return repository.save(rawMaterial);
    }
}