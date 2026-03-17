package com.projedata.factoryoptimizer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projedata.factoryoptimizer.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(String name);
}