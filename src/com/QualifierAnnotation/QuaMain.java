package com.QualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuaMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        QuaProflie proflie = (QuaProflie) context.getBean("QuaProfile");
        proflie.printName();
        proflie.printAge();

    }
}
