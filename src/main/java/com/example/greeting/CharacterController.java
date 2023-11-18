package com.example.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
    @GetMapping("/character")
    public Character getCharacter() {
        return new Character("Luffy", 19, 1500000000);
    }
}

// そして"Hello, World!"に変化を加える。