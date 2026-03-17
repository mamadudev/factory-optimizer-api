package com.projedata.factoryoptimizer.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projedata.factoryoptimizer.service.ProductionService;

@RestController
@RequestMapping("/production")
public class ProductionController {

    @Autowired
    private ProductionService service;

    @PostMapping("/plan")
    public Map<String, Integer> getProductionPlan(@RequestBody Map<String, Integer> request) {
        return service.calculateBestProduction(request);
    }
}