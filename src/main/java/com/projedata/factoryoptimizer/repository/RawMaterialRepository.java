package com.projedata.factoryoptimizer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projedata.factoryoptimizer.entity.Product;
import com.projedata.factoryoptimizer.entity.ProductMaterial;
import com.projedata.factoryoptimizer.entity.RawMaterial;

public interface RawMaterialRepository extends JpaRepository<ProductMaterial, Long> {
    List<ProductMaterial> findByProduct(Product product);

    RawMaterial save(RawMaterial material);
}