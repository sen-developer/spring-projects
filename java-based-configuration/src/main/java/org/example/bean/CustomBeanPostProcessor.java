package org.example.bean;

import org.example.component.HelloComponent;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof HelloComponent) {
            System.out.println("BeanPostProcessor BEFORE init for: " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof HelloComponent) {
            System.out.println("BeanPostProcessor AFTER init for: " + beanName);
        }
        return bean;
    }

}
