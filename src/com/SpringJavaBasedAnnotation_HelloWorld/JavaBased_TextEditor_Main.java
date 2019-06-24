package com.SpringJavaBasedAnnotation_HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBased_TextEditor_Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaBased_TextEditorConfig.class);

        JavaBased_TextEditor textEditor = context.getBean(JavaBased_TextEditor.class);

        textEditor.checkSpell();
    }


}
