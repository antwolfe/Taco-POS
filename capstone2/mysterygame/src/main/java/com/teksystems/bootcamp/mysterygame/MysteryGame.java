package com.teksystems.bootcamp.mysterygame;


import gameobjects.game.Game;

import java.util.Scanner;


public class MysteryGame {

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            game.playGame();
            System.out.print("> ");
            input = scanner.nextLine();
            System.out.println("You entered '" + input + "'");
        } while (!"q".equals(input));
    }
}
