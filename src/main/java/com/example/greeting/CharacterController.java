package com.example.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharacterController {
    @GetMapping("/character")
    public List<Faction> getCharacter() {
        return List.of(
                new Faction("麦わらの一味",
                        List.of (
                                new Character("ルフィ", 19),
                                new Character("ゾロ", 21),
                                new Character("ナミ", 20),
                                new Character("ウソップ", 19),
                                new Character("サンジ", 21),
                                new Character("チョッパー", 17),
                                new Character("ロビン", 30),
                                new Character("フランキー", 36),
                                new Character("ブルック", 90),
                                new Character("ジンベエ", 46)
                        )
                ),
                new Faction("ライバル",
                        List.of (
                                new Character("シャンクス", 39),
                                new Character("ティーチ", 40),
                                new Character("キッド", 23),
                                new Character("ロー", 26)
                        )
                ),
                new Faction("海軍",
                        List.of(
                                new Character("サカズキ", 55),
                                new Character("ガープ", 78),
                                new Character("コビー", 18)
                        )
                )
        );
    }
}

