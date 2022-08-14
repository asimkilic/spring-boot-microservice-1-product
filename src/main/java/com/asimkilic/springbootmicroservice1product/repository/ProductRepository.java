package com.asimkilic.springbootmicroservice1product.repository;

import com.asimkilic.springbootmicroservice1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

