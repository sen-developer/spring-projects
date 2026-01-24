package org.example.component.impl;

import lombok.Getter;
import org.example.component.dto.Car;

@Getter
public class SportCar implements Car {

    Engine engine;

    public SportCar(){
        System.out.println(this.getClass().getName() + " created");
    }

    @Override
    public Boolean hasTurbo() {
        System.out.println("this car has turbo");
        return true;
    }
}
