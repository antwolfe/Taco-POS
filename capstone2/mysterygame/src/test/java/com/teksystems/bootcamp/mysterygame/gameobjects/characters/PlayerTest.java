package com.teksystems.bootcamp.mysterygame.gameobjects.characters;

import com.teksystems.bootcamp.mysterygame.Game;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import com.teksystems.bootcamp.mysterygame.globals.Clue;
import com.teksystems.bootcamp.mysterygame.globals.InteractiveItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    // better to use one instance for one test, not repeated instance
    Player player = new Player("Anthony", "Detective", "cool guy");
    ArrayList<Clue> inventory = new ArrayList<>();

    @BeforeEach
    void setUp() {
        new Map();
        player.setCurrentRoom(Map.getMap().get(0));
    }

    @Test
    void goDirectionTest1() {
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
    void takeClue1() {
        player.setCurrentRoom(Map.getMap().get(3));
        player.takeClue("photo");
        Clue expected = Clue.PHOTO;
        Clue actual = player.takeClue("photo");
        assertEquals(expected, actual);
    }

    @Test
    void takeClue2() {
        player.setCurrentRoom(Map.getMap().get(4));
        player.takeClue("lochness");
        Clue actual = player.takeClue("lochness");
        assertNull(actual);
    }

    @Test
    void takeClue3() {

    }

    @Test
    void addToInventoryTest1() {
        player.setCurrentRoom(Map.getMap().get(4));
        player.addToInventory(player.takeClue("toy"));
        int expected = 1;
        int actual = player.getInventory().size();
        assertEquals(expected, actual);
    }

    void addToInventoryTest2() {

    }

    void addToInventoryTest3() {

    }





}