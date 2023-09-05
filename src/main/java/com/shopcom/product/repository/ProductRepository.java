package com.shopcom.product.repository;

import com.shopcom.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findByProductId(Integer productId);

}
