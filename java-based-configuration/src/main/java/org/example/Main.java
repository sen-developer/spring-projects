package org.example;

import org.example.component.HelloComponent;
import org.example.config.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
        HelloComponent component = (HelloComponent) ctx.getBean("helloComponent");
        component.sayHello();
    }
}