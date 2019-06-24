package com.AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutAnnotation_Main1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        AutAnnotation_TextEditor1 textEditor1 = (AutAnnotation_TextEditor1) context.getBean("AutAnnotation_TextEditor1");
        textEditor1.checkSpell();
    }
}
