package com.projedata.factoryoptimizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projedata.factoryoptimizer.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}