package com.AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class AutAnnotation_TextEditor1 {
    @Autowired
    private AutAnnotation_SpellChecker spellChecker;

    public AutAnnotation_TextEditor1(){
        System.out.println("Inside AutAnnotation_TextEditor1 Constructor!");
    }

    public AutAnnotation_SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void checkSpell(){
        spellChecker.spellChecking();
    }
}
