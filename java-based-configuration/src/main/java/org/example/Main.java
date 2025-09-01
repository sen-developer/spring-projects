package org.example;

import org.example.component.HelloComponent;
import org.example.config.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);

        System.out.println("Application started");

        HelloComponent component = (HelloComponent) ctx.getBean("helloComponent");
//        System.out.printf("The bean type is: %s%n", ctx.getType("helloComponent"));
        component.sayHello();
        ctx.close();
    }
}