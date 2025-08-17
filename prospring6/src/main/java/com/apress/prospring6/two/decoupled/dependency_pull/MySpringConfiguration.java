package com.apress.prospring6.two.decoupled.dependency_pull;

import com.apress.prospring6.two.decoupled.HelloWorldMessageProvider;
import com.apress.prospring6.two.decoupled.MessageProvider;
import com.apress.prospring6.two.decoupled.MessageRenderer;
import com.apress.prospring6.two.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfiguration {

    @Bean // // equivalent to <bean id="provider" class=".."/>
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }

    @Bean // // equivalent to <bean id="renderer" class=".."/>
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(this.provider());
        return renderer;
    }
}
