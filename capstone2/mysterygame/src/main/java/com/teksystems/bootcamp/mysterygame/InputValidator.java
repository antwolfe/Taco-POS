package com.teksystems.bootcamp.mysterygame;

import com.teksystems.bootcamp.mysterygame.gameobjects.characters.Player;
import com.teksystems.bootcamp.mysterygame.globals.Clue;
import com.teksystems.bootcamp.mysterygame.globals.Direction;
import com.teksystems.bootcamp.mysterygame.globals.InteractiveItem;

import static com.teksystems.bootcamp.mysterygame.Game.player;

public class InputValidator {
    private static final InteractiveItem[] itemList = InteractiveItem.values();
    static final String[] commandList = {"take", "go", "look", "examine", "x"};


     static boolean isValidClueToTake(String pickedClue) {
        for (Clue clue : player.getCurrentRoom().getCluesInRoom()) {
            if (pickedClue.equals(clue.getTakeKeyword()) && (!pickedClue.equals("none") && (!player.getInventory().contains(clue)))) {
                return true;
            }
        }
      return false;
    }




    static boolean isValidInventoryCount() {
        if (player.getInventory().size() > 5){
            return true;
        }
        return false;
    }

    private static boolean isValidVerb(String word) {
        for (String command : commandList) {
            if (word.equals(command)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidItem(String word) {
        for (InteractiveItem item : itemList) {
            if (!word.equals(item.toString())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidDirection(String word) {
        for (Direction direction : Direction.values()) {
            if (word.equals(direction.toString())) {
                return true;
            }
        }
        return false;
    }

    protected static boolean isValidCommand(String words) {
        String[] arrWords = words.toLowerCase().split(" ");
        if (arrWords.length != 2) {
            System.out.println("Please use two words");
            return false;
        }
        if (isValidVerb(arrWords[0]) && isValidItem(arrWords[1])) {
            return true;
        }
        if (isValidVerb(arrWords[0]) && isValidDirection(arrWords[1])) {
            return true;
        }
        System.out.println("not a valid command");
        return false;
    }
}
