package com.teksystems.bootcamp.mysterygame.gameobjects.characters;

import com.teksystems.bootcamp.mysterygame.Game;
import com.teksystems.bootcamp.mysterygame.gameobjects.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    // better to use one instance for one test, not repeated instance
        Player player = new Player("Anthony", "Detective", "cool guy", false );
        Room room = player.getCurrentRoom();

    @BeforeEach
    void setUp() {

    }

    @Test
    void goDirectionTest(){
        Room actual = room;
        Room expected = Map.getMap().get(0);


    }




}