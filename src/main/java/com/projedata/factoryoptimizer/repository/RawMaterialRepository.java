package com.projedata.factoryoptimizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projedata.factoryoptimizer.entity.RawMaterial;

public interface RawMaterialRepository extends JpaRepository<RawMaterial, Long> {
}