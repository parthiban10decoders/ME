package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long>{

}
