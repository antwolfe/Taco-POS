package com.teksystems.bootcamp.mysterygame;

import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import com.teksystems.bootcamp.mysterygame.globals.Clue;
import com.teksystems.bootcamp.mysterygame.globals.Direction;
import com.teksystems.bootcamp.mysterygame.globals.InteractiveItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.teksystems.bootcamp.mysterygame.Game.player;

public class ProcessInput {

    private static final InteractiveItem[] itemList = InteractiveItem.values();
    static final String[] commandList = {"take", "go", "look", "examine", "x"};
    static final String[] oneWordList = {"solve", "help", "inventory"};

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

    void helpMenu() {
        // TODO: help keyword in game
    }

    protected static String processCommands(String words) {

        if (words.equals("help me")) {
            Game.showHelpMenu();
        }
        else if (isValidCommand(words)) {
            System.out.println("ok");
            String[] arrWords = words.toLowerCase().split(" ");
            String verb = arrWords[0];
            String noun = arrWords[1];

            if ("look".equals(verb)) {
                if (noun.equals("room")) {
                    player.LookRoom();
                } else if (noun.equals("inventory")) {
                    System.out.println(player.getInventory());
                } else {
                    player.LookItem(noun);
                }
            } else if ("go".equals(verb)) {
                Room currentRoom = player.getCurrentRoom();
                int roomInMap;
                switch (noun) {
                    case "n":
                        roomInMap = currentRoom.getN();
                        player.goDirection(roomInMap);
                        break;
                    case "e":
                        roomInMap = currentRoom.getE();
                        player.goDirection(roomInMap);
                        break;
                    case "s":
                        roomInMap = currentRoom.getS();
                        player.goDirection(roomInMap);
                        break;
                    case "w":
                        roomInMap = currentRoom.getW();
                        player.goDirection(roomInMap);
                        break;
                    case "solve":
                        //validateInventory();
                        player.solveMystery();
                    default:
                        break;
                }
            } else if ("examine".equals(verb) || "x".equals(verb)) {
                player.examineItem(noun);

            } else if ("take".equals(verb)) {
                int currentInventorySize = player.getInventory().size();
                int inventoryMin = 5;
                int inventoryMax = 8;


                if (currentInventorySize == inventoryMax - 1) {
                    System.out.println("You have collected all of the clues. Type 'solve mystery' to solve the case!");
                }
                else if (InputValidator.isValidClueToTake(noun) && currentInventorySize < inventoryMin) {
                    player.addToInventory(player.takeClue(noun));
                } else if (InputValidator.isValidClueToTake(noun)) {
                    System.out.println(
                            "You now have enough clues to solve the mystery!\n " +
                                    "Type 'solve' to access questionnaire or continue collecting clues"
                    );
                    player.addToInventory(player.takeClue(noun));

                } else {
                    System.out.println("This is not a clue you can pick up.");
                }
            } else {
                System.out.println("Do not recognize command");
            }

        }
            return words;

    }

    ;
}
