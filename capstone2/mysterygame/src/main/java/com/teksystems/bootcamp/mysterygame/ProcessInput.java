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

    protected static String processCommands(String words) {

        if (words.equals("help me")) {
            Game.showHelpMenu();
        }
        else if (InputValidator.isValidCommand(words)) {
            String[] arrWords = words.toLowerCase().split(" ");
            String verb = arrWords[0];
            String noun = arrWords[1];

            if ("look".equals(verb)) {
                if (noun.equals("room")) {
                    player.LookRoom();
                } else if (noun.equals("inventory")) {
                    System.out.println(player.getInventory());
                } else {
                    System.out.println(player.LookItem(noun));
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
                        if (InputValidator.isValidInventoryCount()) {
                            player.solveMystery();
                        } else {
                            System.out.println("You don't have enough clues yet");
                        }
                        break;
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
                    System.out.println("You have collected all of the clues. Type 'go solve' to solve the case!");
                } else if (InputValidator.isValidClueToTake(noun) && currentInventorySize < inventoryMin) {
                    player.addToInventory(player.takeClue(noun));
                } else if (InputValidator.isValidClueToTake(noun)) {
                    System.out.println(
                            "You now have enough clues to solve the mystery!\n " +
                                    "Type 'go solve' to access questionnaire or continue collecting clues"
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
