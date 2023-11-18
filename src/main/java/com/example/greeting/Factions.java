package com.example.greeting;

import java.util.List;

public class Factions {
    private String factionalName;
    private final List<Character> character;

    public String getFactionalName() {
        return factionalName;
    }

    public List<Character> getCharacter() {
        return character;
    }

    public Factions(String factionalName, List<Character> character) {
        this.factionalName = factionalName;
        this.character = character;
    }
}

