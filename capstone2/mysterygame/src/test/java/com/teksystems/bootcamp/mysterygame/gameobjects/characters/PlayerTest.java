package com.teksystems.bootcamp.mysterygame.gameobjects.characters;

import com.teksystems.bootcamp.mysterygame.Game;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import com.teksystems.bootcamp.mysterygame.globals.InteractiveItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    // better to use one instance for one test, not repeated instance
        Player player = new Player("Anthony", "Detective", "cool guy");

    @BeforeEach
    void setUp() {
        Game game = new Game();
        new Map();
        player.setCurrentRoom(Map.getMap().get(0));
    }

    @Test
    void goDirectionTest1(){
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

    @Test
    void lookItemTest1() {
        player.LookItem("mat");
        String expected = InteractiveItem.MAT.getDescription();
        String actual = player.LookItem("mat");
        assertEquals(expected, actual);
    }

    @Test
    void lookItemTest2() {
        player.LookItem("dog");
        String expected = "no item of that name here";
        String actual = player.LookItem("dog");
        assertEquals(expected, actual);
    }

    @Test
    void lookItemTest3() {
        player.setCurrentRoom(Map.getMap().get(2));
        String expected = InteractiveItem.TRASHCAN.getDescription();
        String actual = player.LookItem("tra");
        assertEquals(expected, actual);

    }

    @Test
    void examineItemTest1(){

    }

    @Test
    void examineItemTest2(){

    }

    @Test
    void examineItemTest3(){

    }








}