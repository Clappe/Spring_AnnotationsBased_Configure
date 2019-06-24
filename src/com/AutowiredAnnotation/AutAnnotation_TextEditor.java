package com.AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class AutAnnotation_TextEditor {
    private AutAnnotation_SpellChecker spellChecker;

    @Autowired
    public void setSpellChecker(AutAnnotation_SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public AutAnnotation_SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void CheckSpell(){
        spellChecker.spellChecking();
    }
}
