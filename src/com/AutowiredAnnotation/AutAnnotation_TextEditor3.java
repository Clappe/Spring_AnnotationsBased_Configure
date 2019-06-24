package com.AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class AutAnnotation_TextEditor3 {
    private AutAnnotation_SpellChecker spellChecker;

    @Autowired
    public AutAnnotation_TextEditor3(AutAnnotation_SpellChecker spellChecker){
        System.out.println("Inside AutAnnotation_TextEditor3 Constructor!");
        this.spellChecker = spellChecker;
    }

    public void checkSpell(){
        spellChecker.spellChecking();
    }
}
