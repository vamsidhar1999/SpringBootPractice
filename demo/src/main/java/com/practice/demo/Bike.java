package com.practice.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
// Component annotation is for letting Spring know to add this class in IoC container.
// It is called bean. Can be used anywhere with dependency Injection.
// Primary is used as there are two classes implementing Vehicle interface, this is given priority if Interface is injected.
public class Bike implements Vehicle {
    public void drive(){
        System.out.println("Drives Bike");
    }
}
