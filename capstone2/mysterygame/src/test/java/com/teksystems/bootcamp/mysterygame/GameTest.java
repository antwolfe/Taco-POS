package com.teksystems.bootcamp.mysterygame;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    static Game game;


    @BeforeAll
    static void setUp(){
        game = new Game();
    }

    // test return values of things like "look room returns correct room",
    // "look items returns item list in room"
    // "collect clue added to inventory"

}