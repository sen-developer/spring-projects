package org.example.component.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("%s postProcessBeforeInitialization %s %s".formatted(getClass().getSimpleName(), bean.getClass().getSimpleName(), beanName));
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("%s postProcessAfterInitialization %s %s".formatted(getClass().getSimpleName(), bean.getClass().getSimpleName(), beanName));
        return bean;
    }
}
