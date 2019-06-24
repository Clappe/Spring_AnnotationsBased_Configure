package com.SpringJavaBasedAnnotation_HelloWorld;

public class JavaBased_HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Your Message: " + message);
    }
}
