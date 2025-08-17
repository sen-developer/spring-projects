package com.apress.prospring6.two.decoupled.CDL.three;




public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider; // Зависимость, которая будет получена через lookup

    @Override
    public void performLookup(Container container) {
        // Компонент сам запрашивает зависимость у контейнера
        this.messageProvider = (MessageProvider) container.getDependency("provider");
    }

    @Override
    public void render() {
        if (messageProvider == null) {
            System.out.println("MessageProvider is not set!");
            return;
        }
        System.out.println(messageProvider.getMessage());
    }
}
