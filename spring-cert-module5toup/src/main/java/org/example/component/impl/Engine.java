package org.example.component.impl;

import org.example.component.dto.EngineDto;

public class Engine implements EngineDto {

    public Engine(){
        System.out.println("The engine is created");
    }

    @Override
    public void printEngineModel() {
        System.out.println(this.getClass().getName());
    }
}
