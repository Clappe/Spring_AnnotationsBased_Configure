package com.CustomEvent;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<Custom_Event> {
    @Override
    public void onApplicationEvent(Custom_Event custom_event) {
        System.out.println(custom_event.toString());
    }
}
