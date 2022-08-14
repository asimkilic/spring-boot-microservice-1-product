package com.asimkilic.springbootmicroservice1product.service;

import com.asimkilic.springbootmicroservice1product.model.Product;
import com.asimkilic.springbootmicroservice1product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Product saveProduct(Product product) {
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }
    @Override
    public void deleteProductById(Long productId) {
        productRepository.deleteById(productId);
    }
    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
