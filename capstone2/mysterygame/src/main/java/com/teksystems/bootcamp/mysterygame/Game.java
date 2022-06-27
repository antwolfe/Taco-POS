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


    static void initGame() {
        createMap();
        player = new Player("You", "Detective", "Solves crimes. Never seems to get a day off.", true);
        player.setCurrentRoom(map.get(0));
        player.getCurrentRoom().setCharacters(new Actor("Dayra", "Professional Chef", "Warm and kind friend, always wants to cook for you.", false));
        System.out.println(player.getCurrentRoom().getItems());
        playGame();
    }

    static void playGame() {
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



    void displayInstructions() {}
    void displayCommandList() {}


}
