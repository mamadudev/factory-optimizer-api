package com.projedata.factoryoptimizer.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projedata.factoryoptimizer.entity.Product;
import com.projedata.factoryoptimizer.entity.ProductMaterial;
import com.projedata.factoryoptimizer.repository.ProductMaterialRepository;
import com.projedata.factoryoptimizer.repository.ProductRepository;

@Service
public class ProductionService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMaterialRepository productMaterialRepository;

    public Map<String, Integer> calculateBestProduction(Map<String, Integer> request) {

        Map<String, Integer> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry : request.entrySet()) {

            String productName = entry.getKey();
            Integer quantity = entry.getValue();

            Product product = productRepository.findByName(productName)
                    .orElseThrow(() -> new RuntimeException("Product not found: " + productName));

            List<ProductMaterial> materials = productMaterialRepository.findByProduct(product);

            for (ProductMaterial pm : materials) {

                String materialName = pm.getRawMaterial().getName();
                Integer required = (int) (pm.getQuantity() * quantity);

                result.put(materialName,
                        result.getOrDefault(materialName, 0) + required);
            }
        }

        return result;
    }
}