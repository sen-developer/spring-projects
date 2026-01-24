package org.example;


import org.example.component.dto.Car;
import org.example.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        var car = ctx.getBean("car", Car.class);
        car.hasTurbo();
        ctx.close();
    }
}