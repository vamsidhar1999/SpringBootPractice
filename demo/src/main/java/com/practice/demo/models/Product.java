package com.practice.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Product {

    public int id;
    public String name;

    public Product(){}

    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }
}
