package org.example.component.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Arrays;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println(this.getClass().getSimpleName() + ": postProcessBeanFactory listing bean::starts");
        Arrays.asList(configurableListableBeanFactory.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(this.getClass().getSimpleName() + ": postProcessBeanFactory listing bean::ends");
    }
}
