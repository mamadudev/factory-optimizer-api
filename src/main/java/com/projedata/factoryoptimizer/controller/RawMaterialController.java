package com.projedata.factoryoptimizer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projedata.factoryoptimizer.entity.RawMaterial;
import com.projedata.factoryoptimizer.repository.RawMaterialRepository;

@RestController
@RequestMapping("/raw-materials")
public class RawMaterialController {

    @Autowired
    private RawMaterialRepository repository;

    @GetMapping
    public List<RawMaterial> getAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public RawMaterial getById(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public RawMaterial create(@RequestBody RawMaterial material){
        return repository.save(material);
    }

    @PutMapping("/{id}")
    public RawMaterial update(@PathVariable Long id, @RequestBody RawMaterial material){
        material.setId(id);
        return repository.save(material);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}