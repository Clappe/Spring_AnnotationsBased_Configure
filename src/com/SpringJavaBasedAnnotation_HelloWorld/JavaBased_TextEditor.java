package com.SpringJavaBasedAnnotation_HelloWorld;

public class JavaBased_TextEditor {
    private JavaBased_SpellChecker spellChecker;

    public JavaBased_TextEditor(JavaBased_SpellChecker spellChecker){
        System.out.println("Inside JavaBased_TextEditor Constructor.");
        this.spellChecker = spellChecker;
    }

    public void checkSpell(){
        spellChecker.spellChecking();
    }

}
