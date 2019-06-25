package com.EventHandle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandle_Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        context.start();
        EventHandle_HelloWorld helloWorld = (EventHandle_HelloWorld) context.getBean("EventHandle_HelloWorld");
        helloWorld.getMessage();
        context.stop();
    }
}
