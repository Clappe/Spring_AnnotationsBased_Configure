package com.SpringJavaBasedAnnotation_HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaBased_HelloWorldConfig {
    @Bean
    public JavaBased_HelloWorld helloWorld(){
        return new JavaBased_HelloWorld();
    }
}
