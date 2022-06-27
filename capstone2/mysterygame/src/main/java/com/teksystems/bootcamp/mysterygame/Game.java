package com.teksystems.bootcamp.mysterygame;

import com.teksystems.bootcamp.mysterygame.gameobjects.characters.Actor;
import com.teksystems.bootcamp.mysterygame.gameobjects.characters.Player;
import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Room;
import com.teksystems.bootcamp.mysterygame.globals.InteractiveItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Game
{
    private static final ArrayList<Room> map = new ArrayList<>();
    protected static Player player;

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
            output = GameInput.processCommands(input);
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

    void displayInstructions() {}
    void displayCommandList() {}


}
