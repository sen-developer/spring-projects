package com.apress.prospring6.two.decoupled.dependency_pull;

import com.apress.prospring6.two.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringAnnotated {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MySpringConfiguration.class);
        MessageRenderer mr = ctx.getBean("renderer",MessageRenderer.class);
        mr.render();
    }
}
