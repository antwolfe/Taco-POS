package com.teksystems.bootcamp.mysterygame.gameobjects.characters;

import com.teksystems.bootcamp.mysterygame.Game;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    // better to use one instance for one test, not repeated instance
        Player player = new Player("Anthony", "Detective", "cool guy");
//        Room room = player.getCurrentRoom();

    @BeforeEach
    void setUp() {
        Game game = new Game();
        new Map();
        player.setCurrentRoom(Map.getMap().get(0));
    }

    @Test
    void goDirectionTest(){
        player.goDirection(1);
        Room expected = Map.getMap().get(1);
        Room actual = player.getCurrentRoom();
        assertEquals(expected, actual);
    }

    @Test
    void goDirectionTest2() {
        player.setCurrentRoom(Map.getMap().get(1));
        player.goDirection(2);
        Room expected = Map.getMap().get(2);
        Room actual = player.getCurrentRoom();
        assertEquals(expected, actual);
    }

    @Test
    void goDirectionTest3() {
        player.setCurrentRoom(Map.getMap().get(3));
        player.goDirection(-1);
        Room expected = Map.getMap().get(3);
        Room actual = player.getCurrentRoom();
        assertEquals(expected, actual);
    }




}