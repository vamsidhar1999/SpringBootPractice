package com.practice.demo;

import org.springframework.stereotype.Component;

@Component
// Component annotation is for letting Spring know to add this class in Spring container.
// It is called bean. Can be used anywhere with dependency Injection.
public class Car implements Vehicle {
    public void drive(){
        System.out.println("driving Car");
    }
}
