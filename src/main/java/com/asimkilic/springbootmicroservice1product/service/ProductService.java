package com.asimkilic.springbootmicroservice1product.service;

import com.asimkilic.springbootmicroservice1product.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProductById(Long productId);

    List<Product> findAllProducts();
}
