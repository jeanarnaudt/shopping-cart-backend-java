package com.smartcart.repository;

import com.smartcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductsByCategory_Name(String category);

    List<Product> findByBrand(String brand);

    List<Product> findByName(String name);

    List<Product> findProductsByCategoryNameAndBrand(String category, String brand);

    List<Product> findByBrandAndName(String brand, String name);

    Long countByBrandAndName(String brand, String name);
}
