package com.projedata.factoryoptimizer.repository;

import com.projedata.factoryoptimizer.entity.RawMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RawMaterialRepository extends JpaRepository<RawMaterial, Long> {
    com.projedata.factoryoptimizer.entity.RawMaterial findByName(String name);
    com.projedata.factoryoptimizer.entity.RawMaterial findById(long id);
    com.projedata.factoryoptimizer.entity.RawMaterial save(com.projedata.factoryoptimizer.entity.RawMaterial material);
}