package org.example.config;

import lombok.Getter;
import org.example.component.dto.Car;
import org.example.component.dto.EngineDto;
import org.example.component.impl.Engine;
import org.example.component.impl.SportCar;
import org.example.component.processors.CustomBeanFactoryPostProcessor;
import org.example.component.processors.CustomBeanPostProcessor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Car car(){
        return new SportCar();
    }

    @Bean
    public EngineDto engineDto(){
        return new Engine();
    }

    @Bean
    public BeanFactoryPostProcessor beanFactoryPostProcessor(){
        return new CustomBeanFactoryPostProcessor();
    }

    @Bean
    public BeanPostProcessor beanPostProcessor(){
        return new CustomBeanPostProcessor();
    }
}
