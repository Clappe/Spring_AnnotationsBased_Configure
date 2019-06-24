package com.AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutAnnotation_Main3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        AutAnnotation_TextEditor3 editor3 = (AutAnnotation_TextEditor3) context.getBean("AutAnnotation_TextEditor3");
        editor3.checkSpell();
    }


}
