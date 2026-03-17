package com.projedata.factoryoptimizer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projedata.factoryoptimizer.entity.ProductMaterial;
import com.projedata.factoryoptimizer.repository.ProductMaterialRepository;

@RestController
@RequestMapping("/product-materials")
public class ProductMaterialController {

    @Autowired
    private ProductMaterialRepository repository;

    @GetMapping
    public List<ProductMaterial> getAll(){
        return repository.findAll();
    }
    @PostMapping
    public ProductMaterial create(@RequestBody ProductMaterial productMaterial){
        return repository.save(productMaterial);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}