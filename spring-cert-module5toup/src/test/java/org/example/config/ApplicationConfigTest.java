package org.example.config;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
class ApplicationConfigTest {

    @Test
    void car() {

    }

    @Test
    void engineDto() {
    }

    @Test
    void beanFactoryPostProcessor() {
    }

    @Test
    void beanPostProcessor() {
    }
}