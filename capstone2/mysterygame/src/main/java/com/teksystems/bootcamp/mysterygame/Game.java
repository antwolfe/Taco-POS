package com.teksystems.bootcamp.mysterygame;

import gameobjects.characters.Actor;
import gameobjects.rooms.*;
import globals.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Game {
    private ArrayList<Room> map = new ArrayList<>();
    private String[] commandList = {"take", "go", "look"};
    private Items[] itemList = Items.values();
    private ArrayList<String> commands = new ArrayList<>(Arrays.asList(commandList));
    private ArrayList<Items> items = new ArrayList<>(Arrays.asList(itemList));
    private Actor player;

    void initGame() {
        createMap();
        player = new Actor("You", "Detective", "Solves crimes. Never seems to get a day off.", true);
        player.setCurrentRoom(map.get(0));
        player.getCurrentRoom().setCharacters(new Actor("Dayra", "Professional Chef", "Warm and kind friend, always wants to cook for you.", false));
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
            input = scanner.nextLine().toLowerCase();
            output = processCommands(input);
            System.out.println("You entered '" + output + "'");
        } while (!"q".equals(input));
    }


    private void createMap() {
        // create map
        Room backyard = new Room("Backyard", "where the BBQ is taking place", -1, -1, 1, -1);
        Room kitchen = new Room("Kitchen", "where delicious sides line the counters and island", 0, 2, -1, 3);
        Room cellar = new Room("Cellar", "damp and dark, gives you the shivers", -1, -1, -1, 1);
        Room hallway = new Room("Hallway", "warm and cozy, looks like a good place to watch for suspects", 4, -1, -1, -1);
        Room office = new Room("Office", "Dayra's office. Where the crime took place", -1, 0, 3, -1);

        map.addAll(Arrays.asList(backyard, kitchen, cellar, hallway, office));
        for (Room room : map
        ) {
            System.out.println(room.getName());
        }
    }

    // TODO: one command word breaks validation // contains() not strong enough for user validation // write tests
    protected boolean isValidCommand(String words) {
        String[] arrWords = words.toLowerCase().split(" ");
        if (arrWords.length != 2) {
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

    private String processCommands(String words) {
        if (isValidCommand(words)) {
            System.out.println("ok");
            String[] arrWords = words.toLowerCase().split(" ");
            String verb = arrWords[0];
            String noun = arrWords[1];

            // TODO: needs stronger validation. any noun that's not "room" will auto look item ?? isValid will handle?

            if ("look".equals(verb)) {
                if (noun.equals("room")) {
                    LookRoom();
                } else {
                    LookItem();
                }
            }

            if ("go".equals(verb)) {
                String noRoom = "There is no room that way.";
                switch (noun) {
                    case "n":
                        if (player.getCurrentRoom().getN() == -1) {
                            System.out.println(noRoom);
                        } else {
                            goDirection('n');
                            break;
                        }
                    case "e":
                        if (player.getCurrentRoom().getE() == -1) {
                            System.out.println(noRoom);
                        } else {
                            goDirection('e');
                            break;
                        }
                    case "s":
                        if (player.getCurrentRoom().getS() == -1) {
                            System.out.println(noRoom);
                        } else {
                            goDirection('s');
                            break;
                        }
                    case "w":
                        if (player.getCurrentRoom().getW() == -1) {
                            System.out.println(noRoom);
                        } else {
                            goDirection('w');
                            break;
                        }
                    default:
                        break;
                }
            } else {
                System.out.println("Not a valid direction");
            }

        } else {
            System.out.println("not a valid command");
        }
        return words;
    }


    private void LookRoom() {
        System.out.println("You are in the " + player.getCurrentRoom().getName() + ". It is " + player.getCurrentRoom().getDescription() + ".");
    }

    private void LookItem() {
    }

    private void goDirection(char direction) {
        Room newRoom;
        switch (direction) {
            case 'n':
                newRoom = map.get(player.getCurrentRoom().getN());
                player.setCurrentRoom(map.get(player.getCurrentRoom().getN()));
                LookRoom();
                break;
            case 'e':
                newRoom = map.get(player.getCurrentRoom().getE());
                player.setCurrentRoom(newRoom);
                LookRoom();
                break;
            case 's':
                newRoom = map.get(player.getCurrentRoom().getS());
                player.setCurrentRoom(newRoom);
                LookRoom();
                break;
            case 'w':
                newRoom = map.get(player.getCurrentRoom().getW());
                player.setCurrentRoom(newRoom);
                System.out.println(player.getCurrentRoom().getName());
                LookRoom();
                break;
            default:
                break;

        }
    }


}
