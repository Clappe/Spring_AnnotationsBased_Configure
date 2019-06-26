package com.CustomEvent;

import org.springframework.context.ApplicationEvent;

public class Custom_Event extends ApplicationEvent {
    public Custom_Event(Object source){
        super(source);
    }

    @Override
    public String toString() {
        return "My Custom Event.";
    }
}
