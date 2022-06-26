package com.teksystems.bootcamp.mysterygame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void goDeskCommandShouldReturnTrue(){
        Game game = new Game();
        String command = "go desk";
        assertTrue(game.isValidCommand(command));
    }

    @Test
    void lookRoomCommandShouldReturnTrue(){
        Game game = new Game();
        String command = "look room";
        assertTrue(game.isValidCommand(command));
    }

    @Test
    void goDesCommandShouldReturnFalse(){
        Game game = new Game();
        String command = "go des";
        assertFalse(game.isValidCommand(command));
    }

    @Test
    void goingNFromKitchenShouldSetRoomToBackyard() {
        Game game = new Game();
        String direction = "go n";

    }
}