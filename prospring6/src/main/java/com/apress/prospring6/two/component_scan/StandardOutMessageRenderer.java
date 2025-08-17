package com.apress.prospring6.two.component_scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.lang.System.out;

@Component("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private com.apress.prospring6.two.decoupled.MessageProvider messageProvider;

    public StandardOutMessageRenderer() {
        out.println(" --> StandardOutMessageRenderer: constructor called");
    }

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                "You must set the property messageProvider of class:" +
                StandardOutMessageRenderer.class.getName());
        }
        out.println(messageProvider.getMessage());
    }

    @Autowired
    @Override
    public void setMessageProvider(com.apress.prospring6.two.decoupled.MessageProvider provider) {
        out.println(" --> StandardOutMessageRenderer: setting the provider");
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}