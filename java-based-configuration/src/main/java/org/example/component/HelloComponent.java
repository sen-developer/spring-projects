package org.example.component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


public class HelloComponent implements InitializingBean, DisposableBean {
    private String message;

    public HelloComponent(){
        System.out.println("Created HelloComponent via constructor");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello(){
//        System.out.println(message);
        System.out.println("Called Method say hello");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean interface");
    }

    @PostConstruct
    public void demo(){
        System.out.println("Post construct method");
    }

    @PreDestroy
    public void d(){
        System.out.println("Pre destroy method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy via DisposableBean");
    }

    public void customInit(){
        System.out.println("Custom init");
    }

    public void customDestroy(){
        System.out.println("Custom destroy");
    }
}
