package com.teksystems.bootcamp.mysterygame;


import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.characters.Player;

import java.util.Scanner;
import static com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Map.getMap;


public class Game
{
    protected static Player player;

    static void initGame() {
        new Map();
        player = new Player("You", "Detective", "Solves crimes. Never seems to get a day off.");
        player.setCurrentRoom(getMap().get(0));
        playGame();
    }

    static void playGame() {
        displayInstructions();
        System.out.println("Try 'look room'");
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("> ");
            input = scanner.nextLine().toLowerCase();
            ProcessInput.processCommands(input);
        } while (!"q".equals(input));
    }

    static void displayInstructions() {
        System.out.println(
                "\n......................................................................\n" +
                        ".   o   \\ o /  _ o        __|    \\ /     |__         o _  \\ o /   o   .\n" +
                        ".  /|\\    |     /\\   __\\o   \\o    |    o/     o/__   /\\     |    /|\\  .\n" +
                        ".  / \\   / \\   | \\  /) |    ( \\  /o\\  / )    |   (\\  / |   / \\   / \\  .\n" +
                        ".       .......................................................       .\n" +
                        ". \\ o / .            WHAT HAPPENED TO THE MAZE?               . \\ o / .\n" +
                        ".   |   .                                                     .   |   .\n" +
                        ".  / \\  .      Hello detective! Your friend invited you       .  / \\  .\n" +
                        ".       .     to a BBQ party! You were having a great time    .       .\n" +
                        ".  _ o  .     until your friend noticed that their favorite   .  _ o  .\n" +
                        ".   /\\  .   maze puzzle has gone missing from their office!   .   /\\  .\n" +
                        ".  | \\  .                                                     .  | \\  .\n" +
                        ".       .        As the only friend at the BBQ who is also a  .       .\n" +
                        ".       .    professional sleuth, it's up to you to solve the .       .\n" +
                        ".  __\\o .               mystery in time for dessert!          .  __\\o .\n" +
                        ". /) |  .                                                     . /) |  .\n" +
                        ".       . Type 'help me' for a hint & 'q' to quit at any time .       .\n" +
                        ". __|   .                                                     . __|   .\n" +
                        ".   \\o  .                                                     .    \\o .\n" +
                        ".   ( \\ .                      RULES                          .   ( \\ .\n" +
                        ".       .           Entries must be two words only.           .       .\n" +
                        ".  \\ /  . Find the minimum number of clues and solve the case .  \\ /  .\n" +
                        ".   |   .                                                     .   |   .\n" +
                        ".  /o\\  .               GAMEPLAY INSTRUCTIONS                 .  /o\\  .\n" +
                        ".       .   You'll go around looking for clues in the house.  .       .\n" +
                        ".   |__ . Use one of the commands: 'go, look, examine or take'.   |__ .\n" +
                        ". o/    .  and one mystery keyword provided by the items      . o/    .\n" +
                        "./ )    .                    to progress.                     ./ )    .\n" +
                        ".       .   Moving around the house can be done by using one  .       .\n" +
                        ".       .            of the cardinal directions.              .       .\n" +
                        ". o/__  .             (ex: 'go n' to move north)              . o/__  .\n" +
                        ".  | (\\ .                                                     . |  (\\ .\n" +
                        ".       .   Looking at or examining items in the rooms will   .       .\n" +
                        ".  o _  .    help you find and collect the clues needed to    .  o _  .\n" +
                        ".  /\\   .                 solve the case.                     .  /\\   .\n" +
                        ".  / |  .       (ex: 'look room' to look around the room)     .  / |  .\n" +
                        ".       .                                                     .       .\n" +
                        ". \\ o / .   Once you find a clue, 'take' it with you to       . \\ o / .\n" +
                        ".   |   .         use it in your final revelation!            .   |   .\n" +
                        ".  / \\  .                                                     .  / \\  .\n" +
                        ".       .......................................................       .\n" +
                        ".   o   \\ o /  _ o        __|    \\ /     |__         o _  \\ o /   o   .\n" +
                        ".  /|\\    |     /\\   __\\o   \\o    |    o/     o/__   /\\     |    /|\\  .\n" +
                        ".  / \\   / \\   | \\  /) |    ( \\  /o\\  / )    |   (\\  / |   / \\   / \\  .\n" +
                        "dc.....................................................................\n"
        );
    }

    public static void showHelpMenu() {
        displayCommandList();
    }

    static void displayCommandList() {
        if (player.getInventory().isEmpty()) {
            System.out.println(
                    "Try the commands below with some words you find.\n" +
                    " - go n/s/e/w \n - look <item> \n - look room \n - examine <keyword> \n - take <keyword>"
            );
        } else {
        System.out.println(
                "Remember to look for keywords. Here are all possible commands in the game.\n" +
                "GodMode Command List:\n" +
        " - go n/s/e/w \n - look <item> \n - look room \n - look pockets \n - examine <keyword> \n - take <keyword> \n - go solve \n - help me");
        }
    }


}
