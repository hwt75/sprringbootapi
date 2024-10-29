package com.springbootapi.springbootapi.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapi.springbootapi.entity.ProductEntity;
import com.springbootapi.springbootapi.repository.ProductRepository;
import com.springbootapi.springbootapi.service.ProductService;

@Service
public class ProductServiceImplement implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    // @Override
    // public ProductEntity createProduct(ProductEntity product) {
    //     return productRepository.createProduct(product);
    // }

    // @Override
    // public List<ProductEntity> findAllProducts() {
    //     return productRepository.findAllProducts();
    // }
    
}
