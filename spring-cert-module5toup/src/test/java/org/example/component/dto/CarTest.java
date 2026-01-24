package org.example.component.dto;

import org.example.config.ApplicationConfig;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
class CarTest {

    @Autowired
    private Car car;

    @Test
    void hasTurbo() {
//        car.hasTurbo();
    }
}