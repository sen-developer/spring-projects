package org.example;


import org.example.component.HelloComponent;
import org.example.component.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);

        var hello = ctx.getBean(HelloComponent.class);
        hello.sayHello();
        ctx.close();
    }
}