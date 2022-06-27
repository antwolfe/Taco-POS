package com.teksystems.bootcamp.mysterygame.gameobjects.characters;

import com.teksystems.bootcamp.mysterygame.Game;
import com.teksystems.bootcamp.mysterygame.gameobjects.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import com.teksystems.bootcamp.mysterygame.globals.Clue;
import com.teksystems.bootcamp.mysterygame.globals.InteractiveItem;


public class Player extends Actor {

//  ArrayList<GameItem> clues; // should i have all the interactives and clues under one class(GameItem)? // make arraylist of just clues?


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
            if (interItem.toString().toLowerCase().contains(item) && currentRoom.getItems().contains(interItem)) {
                System.out.println(interItem.getDescription());
            }
        }
    }

    public void examineItem(){
        // "You look closer to + item + and see a + clue. What do you want to do with + clue? "take", "look"...
        // "look" will provide details about how the clue fits into the story
        // "take" will "takeClue" and put clue item into inventory
    }


    public void takeClue(Clue clue){
        // after examining item, clue will be exposed.
        // player will put clue into inventory
    }


}
