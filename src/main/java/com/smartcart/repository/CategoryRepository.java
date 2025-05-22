package com.smartcart.repository;

import com.smartcart.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
    Boolean existsByName(String name);
}
