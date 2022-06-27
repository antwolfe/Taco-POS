package com.teksystems.bootcamp.mysterygame;

import gameobjects.characters.Actor;
import gameobjects.characters.Player;
import gameobjects.rooms.*;
import globals.InteractiveItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Game
{
    private static final ArrayList<Room> map = new ArrayList<>();
    private final InteractiveItem[] itemList = InteractiveItem.values(); // TODO: refactor (14 - 17)
    private final ArrayList<InteractiveItem> items = new ArrayList<>(Arrays.asList(itemList));
    private final String[] commandList = {"take", "go", "look", "examine"};
    private final ArrayList<String> commands = new ArrayList<>(Arrays.asList(commandList));
    private Player player;

    void initGame() {
        createMap();
        player = new Player("You", "Detective", "Solves crimes. Never seems to get a day off.", true);
        player.setCurrentRoom(map.get(0));
        player.getCurrentRoom().setCharacters(new Actor("Dayra", "Professional Chef", "Warm and kind friend, always wants to cook for you.", false));
        System.out.println(player.getCurrentRoom().getItems());
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

    public static ArrayList<Room> getMap() { return map; }

    private void createMap() {
        // create map // TODO: refactor HashMap? make Room enums? how to add arraylist if make enums? (extend Room class and... where can i put arraylists of items per room?)
        Room backyard = new Room("Backyard", "where the BBQ is taking place", -1, 4, 1, -1, new ArrayList<>
                (Arrays.asList(InteractiveItem.BBQ_PIT, InteractiveItem.MAT)));
        Room kitchen = new Room("Kitchen", "where delicious sides line the counters and island", 0, 2, -1, 3, new ArrayList<>
                (Arrays.asList(InteractiveItem.FRIDGE, InteractiveItem.OVEN, InteractiveItem.COUNTER)));
        Room cellar = new Room("Cellar", "damp and dark, gives you the shivers", -1, -1, -1, 1, new ArrayList<>
                (Arrays.asList(InteractiveItem.TRASHCAN)));
        Room hallway = new Room("Hallway", "warm and cozy, looks like a good place to watch for suspects", 4, 1, -1, -1, new ArrayList<>
                (Arrays.asList(InteractiveItem.MAT, InteractiveItem.TRASHCAN)));
        Room office = new Room("Office", "Dayra's office. Where the crime took place", -1, 0, 3, -1, new ArrayList<>
                (Arrays.asList(InteractiveItem.COMPUTER, InteractiveItem.DESK)));

        map.addAll(Arrays.asList(backyard, kitchen, cellar, hallway, office));
        // map list TODO: remove before prod.
//        int i = 0;
//        for (Room room : map
//        ) {
//            System.out.println(i + ". " + room.getName());
//            i++;
//        }
    }

    // TODO: stronger validation refactor:
    //  one command word breaks validation
    //  contains() not strong enough for user validation
    //  write tests
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
            // refactor: switch statement? It broke when using switch. b/c of double switch?

            if ("look".equals(verb)) {
                if (noun.equals("room")) {
                    player.LookRoom();
                } else {
                    player.LookItem(noun);
                }
            }

            else if ("go".equals(verb)) {
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
                    default:
                        break;
                }
            }

            else if ("examine".equals(verb)) {
                System.out.println("examining item");
            }

            else if ("take".equals(verb)) {
                System.out.println("putting clue into inventory");
            }

            else {
                System.out.println("Not a valid direction");
            }

        } else {
            System.out.println("not a valid command");
        }
        return words;
    }




}
