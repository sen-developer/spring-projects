package com.apress.prospring6.two.component_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        var renderer = ctx.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
}