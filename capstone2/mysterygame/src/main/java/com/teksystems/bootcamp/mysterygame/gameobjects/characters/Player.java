package com.teksystems.bootcamp.mysterygame.gameobjects.characters;

import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import com.teksystems.bootcamp.mysterygame.globals.Clue;
import com.teksystems.bootcamp.mysterygame.globals.InteractiveItem;

import java.util.ArrayList;


public class Player extends Actor {

    private ArrayList<Clue> inventory;


    public Player(String name, String occupation, String description, boolean hasAlibi) {
        super(name, occupation, description, hasAlibi);
        this.currentRoom = getCurrentRoom();
    }

    public void goDirection(int direction) {
        Room newRoom;
        String noRoom = "There is no room that way.";
        if (direction == -1) {
            System.out.println(noRoom);
        } else {
            newRoom = Map.getMap().get(direction);
            setCurrentRoom(newRoom);
            LookRoom();
        }
    }

    public void LookRoom() { // return Room
        System.out.println("You are in the " + currentRoom.getName()
                + ". It is " + currentRoom.getDescription() + ".");
        // It has <Items>, do you want to look at any items?
        System.out.println("It has: " + currentRoom.getItems());
    }

    public void LookItem(String item) { // return list of items in room
        //add items to rooms
        for (InteractiveItem interItem : InteractiveItem.values()) {
            if (interItem.toString().contains(item) && currentRoom.getItems().contains(interItem)) {
                System.out.println(interItem.getDescription());
            }
        }
    }

    public void examineItem(String word){ // return Clue
        // "You look closer to + item + and see a + clue. What do you want to do with + clue? "take", "look"...
        // "look" will provide details about how the clue fits into the story
        // "take" will "takeClue" and put clue item into inventory

        for (InteractiveItem interItem : InteractiveItem.values()) {
            if (interItem.toString().contains(word) && currentRoom.getItems().contains(interItem)) {
                System.out.println("You look closer to " + interItem + ". " + interItem.getClue(word).getDescription());
            }
        }
    }

    public void takeClue(Clue clue) {
        // after examining item, clue will be exposed.
        // player will put clue into inventory


    }


}
