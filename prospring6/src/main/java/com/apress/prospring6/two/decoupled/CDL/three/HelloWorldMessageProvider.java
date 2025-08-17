package com.apress.prospring6.two.decoupled.CDL.three;

public class HelloWorldMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello World from CDL!";
    }
}
