package com.CustomEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("CustomEventPublisher");
        customEventPublisher.publish();
        customEventPublisher.publish();
    }
}
