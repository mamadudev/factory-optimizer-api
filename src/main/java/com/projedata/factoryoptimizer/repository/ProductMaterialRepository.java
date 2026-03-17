package com.projedata.factoryoptimizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projedata.factoryoptimizer.entity.ProductMaterial;

public interface ProductMaterialRepository extends JpaRepository<ProductMaterial, Long> {
}