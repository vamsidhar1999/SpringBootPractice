package com.practice.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity // For JPA to recognize this as DB Model
public class Product {

    @Id // Primary key
    public int id;
    public String name;

    public Product(){}

    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }
}
