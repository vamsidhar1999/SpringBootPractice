package com.practice.demo.shared;

import com.practice.demo.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // Constructor Injection
//    private Vehicle vehicle;
//    public Dev(Vehicle vehicle){
//        this.vehicle = vehicle;
//    }

    // Field Injector
    @Autowired  // Maps to the vehicle interface from all beans
    @Qualifier("car") // Configuring Primary class here. bean names are stored as camelCase of class name
    private Vehicle vehicle;

    public void build(){
        vehicle.drive();
    }
}
