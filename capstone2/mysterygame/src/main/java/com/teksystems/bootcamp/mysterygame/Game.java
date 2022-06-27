package com.teksystems.bootcamp.mysterygame;

import com.teksystems.bootcamp.mysterygame.gameobjects.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.characters.Actor;
import com.teksystems.bootcamp.mysterygame.gameobjects.characters.Player;
import java.util.Scanner;
import static com.teksystems.bootcamp.mysterygame.gameobjects.Map.getMap;


public class Game
{
    protected static Player player;


    static void initGame() {
        Map map = new Map();
        player = new Player("You", "Detective", "Solves crimes. Never seems to get a day off.", true);
        player.setCurrentRoom(getMap().get(0));
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
