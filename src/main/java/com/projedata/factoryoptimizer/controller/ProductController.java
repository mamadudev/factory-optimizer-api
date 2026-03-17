package com.projedata.factoryoptimizer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projedata.factoryoptimizer.entity.Product;
import com.projedata.factoryoptimizer.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public List<Product> getAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return repository.save(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product newProduct){

        Product product = repository.findById(id).orElseThrow();

        product.setCode(newProduct.getCode());
        product.setName(newProduct.getName());
        product.setPrice(newProduct.getPrice());

        return repository.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}