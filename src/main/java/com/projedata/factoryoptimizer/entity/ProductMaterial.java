package com.projedata.factoryoptimizer.entity;

import jakarta.persistence.*;

@Entity
public class ProductMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double quantity;

    @ManyToOne
    private Product product;

    @ManyToOne
    private RawMaterial rawMaterial;

    public ProductMaterial(){}

    public Long getId() {
        return id;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }
}