package org.example.component;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public MessageService(){
        System.out.println("Created MessageService via constructor");
    }

    public String helloMessage(){

        return "Hello form Message";
    }
}
