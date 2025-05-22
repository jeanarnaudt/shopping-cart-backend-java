package com.smartcart.service.product;

import com.smartcart.model.Product;
import com.smartcart.request.AddProductRequest;
import com.smartcart.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long id);

    void deleteProduct(Long id);

    List<Product> getAllProducts();
    List<Product> getProductsByName(String name);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByBrandAndName(String brand, String name);

    Long getProductCountByBrandAndName(String brand, String name);
}
