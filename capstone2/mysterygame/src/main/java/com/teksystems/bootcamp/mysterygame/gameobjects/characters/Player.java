package com.teksystems.bootcamp.mysterygame.gameobjects.characters;

import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import com.teksystems.bootcamp.mysterygame.globals.Clue;
import com.teksystems.bootcamp.mysterygame.globals.InteractiveItem;

import java.util.ArrayList;
import java.util.List;


public class Player extends Actor {

    private ArrayList<Clue> inventory; //


    public Player(String name, String occupation, String description) {
        super(name, occupation, description);
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
        System.out.println("It has: " + currentRoom.getItems() + ".\n" +
                "Use 'look' to find next keyword.");

    }

    public void LookItem(String item) { // return list of items in room
        for (InteractiveItem interItem : InteractiveItem.values()) {
            if (interItem.toString().contains(item) && currentRoom.getItems().contains(interItem)) {
                System.out.println(interItem.getDescription());
            }
        }
    }

    public void examineItem(String word) { // TODO: return Clue, fix returned description

        for (InteractiveItem interItem : InteractiveItem.values()) {
            if (interItem.getClueKeyword().contains(word) && currentRoom.getItems().contains(interItem)) {
                System.out.println("You look closer to " + interItem + ".");
                interItem.displayClue();
            }
        }

    }

    public void takeClue(String pickedClue) {
        // put clue in inventory
        System.out.println(pickedClue);
        System.out.println(currentRoom.getCluesInRoom());
        for (Clue clue : currentRoom.getCluesInRoom()) {
            if (pickedClue.equals(clue.getTakeKeyword())) {
                System.out.println("You took " + clue + " for later.");
            }
        }
    }


}
