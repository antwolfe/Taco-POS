package com.teksystems.bootcamp.mysterygame.gameobjects.characters;

import com.teksystems.bootcamp.mysterygame.InputValidator;
import com.teksystems.bootcamp.mysterygame.gameobjects.Quiz;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import com.teksystems.bootcamp.mysterygame.globals.Clue;
import com.teksystems.bootcamp.mysterygame.globals.InteractiveItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Player extends Actor {

    private ArrayList<Clue> inventory; //


    public Player(String name, String occupation, String description) {
        super(name, occupation, description);
        this.currentRoom = getCurrentRoom();
        this.inventory = new ArrayList<>();
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

    public Clue takeClue(String pickedClue) {
        // validate correct clue
            Clue guessedClue = null;
            for (Clue clue : currentRoom.getCluesInRoom()) {
                if (pickedClue.equals(clue.getTakeKeyword())) {
                    guessedClue = clue;
                }
            }
            System.out.println("You took " + guessedClue + " for later.");
            return guessedClue;

    }

    public ArrayList<Clue> getInventory() {
        return inventory;
    }

    public void addToInventory(Clue inventory) {
        this.inventory.add(inventory);
    }

    public void solveMystery() {
        System.out.println("Time to solve the mystery!");
        System.out.println(Arrays.toString(Quiz.getQuestions()));
    }
}
