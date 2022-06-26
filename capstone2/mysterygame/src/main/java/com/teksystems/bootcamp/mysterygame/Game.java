package com.teksystems.bootcamp.mysterygame;

import gameobjects.characters.Actor;
import gameobjects.rooms.*;
import globals.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Game {
    private ArrayList<Room> map = new ArrayList<>();
    private String[] commandList = {"take", "drop", "look"};
    private Items[] itemList = Items.values();
    private ArrayList<String> commands = new ArrayList<>(Arrays.asList(commandList));
    private ArrayList<Items> items = new ArrayList<>(Arrays.asList(itemList));

    void initGame() {
        createMap();
        Actor player = new Actor("You", "Detective", "Solves crimes. Never seems to get a day off.", true);
        player.setCurrentRoom(map.get(0));
        System.out.println(player.getCurrentRoom().getDescription());
    }

    void playGame() {
        // instructions
        // game description
        // main loop

        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        String input;
        String output = "";
        do {
            System.out.print("> ");
            input = scanner.nextLine();
            output = processCommands(input);
            System.out.println("You entered '" + output + "'");
        } while (!"q".equals(input));
    }

    private void createMap() {
        // create map
        map.add(new Room("Backyard", "Where the BBQ is taking place", -1, -1, 1, -1));
        map.add(new Room("Kitchen", "Delicious sides line the counters and island", 0, 2, -1, 3));
        map.add(new Room("Cellar", "Damp and dark, what could possibly be in here?", -1, -1, -1, 1));
        map.add(new Room("Hallway", "Warm and cozy, looks like a good place to watch for suspects", 4, -1, -1, -1));
        map.add(new Room("Office", "Dayra's office. Where the crime took place", -1, 0, 3, -1));
    }

    private String processCommands(String words) {
        if (isValidCommand(words)) {
            System.out.println("ok");

        } else {
            System.out.println("This is not a valid command");
        }
        return words;
    }



    // TODO: one command word breaks validation // contains() not strong enough for user validation // write tests
    private boolean isValidCommand(String words) {
        String[] arrWords = words.toLowerCase().split(" ");
        if (arrWords.length != 2 ) {
            System.out.println("Please use two words");
            return false;
        }
        if (!commands.contains(arrWords[0])) {
            System.out.println("Command is incorrect");
            return false;
        }
        if (!items.toString().toLowerCase().contains(arrWords[1])) {
            System.out.println("Item is incorrect");
            return false;
        }
        return true;
    }

}
