package com.RequiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReqAnnotaiton_Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        ReqAnnotation_Student student = (ReqAnnotation_Student) applicationContext.getBean("ReqAnnotation_Student");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
