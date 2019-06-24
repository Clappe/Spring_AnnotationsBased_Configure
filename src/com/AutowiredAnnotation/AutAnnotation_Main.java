package com.AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutAnnotation_Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        AutAnnotation_TextEditor textEditor = (AutAnnotation_TextEditor) context.getBean("AutAnnotation_TextEditor");
        textEditor.CheckSpell();
    }
}
