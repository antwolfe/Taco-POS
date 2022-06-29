package com.teksystems.bootcamp.mysterygame.gameobjects.characters;

import com.teksystems.bootcamp.mysterygame.Game;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
    // better to use one instance for one test, not repeated instance
        Player player = new Player("Anthony", "Detective", "cool guy", false );
        Room room = player.getCurrentRoom();

    @BeforeEach
    void setUp() {
        Game game = new Game();
        new Map();
        player.setCurrentRoom(Map.getMap().get(0));
    }

    @Test
    void goDirectionTest(){
        Room actual = room;
        Room expected = Map.getMap().get(1);
        assert(actual, player.goDirection(1));
    }




}