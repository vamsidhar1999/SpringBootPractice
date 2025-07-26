package com.practice.demo.services;

import com.practice.demo.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "Mobile"),
            new Product(2, "Lappy")));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int productId){
        return products.stream()
                .filter(product -> product.id == productId)
                .findFirst().get();
    }

    public void addProduct(Product product){
        products.add(product);
    }
}
