package com.practice.demo.services;

import com.practice.demo.models.Product;
import com.practice.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(int productId){
        return productRepository.findById(productId).orElse(new Product());
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }
}
