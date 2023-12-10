package com.ecom.api.services;

import com.ecom.api.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{


    @Override
    public List<Product> getAllProducts(String search, int categoryId) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(int productId) {
        return null;
    }
}
