package org.example.component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("helloComponent")  // <-- annotation-ով Spring autodetect
public class HelloComponent implements InitializingBean, DisposableBean {

    private MessageService messageService;

    public HelloComponent() {
        System.out.println("Created HelloComponent via constructor");
    }

    @Autowired
    @Lazy
    public void setMessage(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostConstruct
    public void init() {
        System.out.println("Post construct method");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("InitializingBean interface");
    }

    public void customInit() {
        System.out.println("Custom init");
    }

    public void sayHello() {
        System.out.println(this.messageService.helloMessage());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre destroy method");
    }

    @Override
    public void destroy() {
        System.out.println("destroy via DisposableBean");
    }

    public void customDestroy() {
        System.out.println("Custom destroy");
    }
}