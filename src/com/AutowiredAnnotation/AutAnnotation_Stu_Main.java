package com.AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutAnnotation_Stu_Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        AutAnnotation_Student student = (AutAnnotation_Student) context.getBean("AutAnnotation_Student");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
