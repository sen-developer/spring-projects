package org.example.config;

import org.example.component.HelloComponent;
import org.example.component.HelloMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    @Scope(scopeName = "singleton")
    @Lazy
    public HelloComponent helloComponent() {
        var tmp = new HelloComponent();
//        tmp.setMessage(new HelloMessage().helloMessage());
        return tmp;
    }

    @Bean
    @Scope(scopeName = "prototype")
    public HelloMessage helloMessage(){
        return new HelloMessage();
    }


}
