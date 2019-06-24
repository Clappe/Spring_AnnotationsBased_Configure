package com.QualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class QuaProflie {
    @Autowired
    @Qualifier("student1")
    private QuaAnnotation_Student student;

    public QuaProflie(){
        System.out.println("Inside QuaProfile Constructor!");
    }

    public void printName(){
        System.out.println("Name: " + student.getName());
    }

    public void printAge(){
        System.out.println("Age: " + student.getAge());
    }
}
