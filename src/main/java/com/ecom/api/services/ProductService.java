package com.ecom.api.services;

import com.ecom.api.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts(String search, int categoryId);
    Product createProduct(Product product);
    Product getProductById(int productId);
}
