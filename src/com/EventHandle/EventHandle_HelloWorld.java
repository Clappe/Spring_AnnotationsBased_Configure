package com.EventHandle;

public class EventHandle_HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Your message: " + message );
    }
}
