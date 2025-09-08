package org.example.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component  // <-- Spring autodetect as BeanPostProcessor
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof HelloComponent) {
            System.out.println("BeanPostProcessor BEFORE init: " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof HelloComponent) {
            System.out.println("BeanPostProcessor AFTER init: " + beanName);
        }
        return bean;
    }
}
