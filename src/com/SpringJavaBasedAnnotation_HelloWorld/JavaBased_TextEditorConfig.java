package com.SpringJavaBasedAnnotation_HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBased_TextEditorConfig {
    @Bean
    public JavaBased_SpellChecker getSpellChecker(){
        return new JavaBased_SpellChecker();
    }

    @Bean
    public JavaBased_TextEditor getTextEditor(){
        return new JavaBased_TextEditor(getSpellChecker());
    }

}
