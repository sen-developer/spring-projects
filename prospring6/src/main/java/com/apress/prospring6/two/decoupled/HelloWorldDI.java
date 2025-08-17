package com.apress.prospring6.two.decoupled;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class HelloWorldDI {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");

        var mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}