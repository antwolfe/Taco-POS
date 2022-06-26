package com.teksystems.bootcamp.mysterygame;

import gameobjects.rooms.*;
import globals.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Game {
    private ArrayList<Room> map = new ArrayList<>();



    void playGame() {
        // instructions
        // game description
        // main loop
        Scanner scanner = new Scanner(System.in);
        String input;
        String output = "";
        do {
            game.playGame();
            System.out.print("> ");
            input = scanner.nextLine();
            output = game.pr
            System.out.println("You entered '" + input + "'");
        } while (!"q".equals(input));
   }

   public void createMap() {
       // create map
       map.add(new Room("Backyard", "Where the BBQ is taking place", -1, -1, 1, -1));
       map.add(new Room("Kitchen", "Delicious sides line the counters and island", 0, 2, -1, 3));
       map.add(new Room("Cellar", "Damp and dark, what could possibly be in here?", -1, -1, -1, 1));
       map.add(new Room("Hallway", "Warm and cozy, looks like a good place to watch for suspects", 4, -1, -1, -1));
       map.add(new Room("Office", "Dayra's office. Where the crime took place", -1, 0, 3, -1));
   }

   public void processCommands(){
    ArrayList<String> commands = new ArrayList<>();
    ArrayList<Items> items = new ArrayList<>();
        //process commands
       String[] commandList = {"take", "drop", "look"};
       Items [] itemList = Items.values();
       commands.addAll(Arrays.asList(commandList));
       items.addAll(Arrays.asList(itemList));

   }

}
