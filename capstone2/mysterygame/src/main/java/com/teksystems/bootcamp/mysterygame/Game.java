package com.teksystems.bootcamp.mysterygame;


import com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Map;
import com.teksystems.bootcamp.mysterygame.gameobjects.characters.Actor;
import com.teksystems.bootcamp.mysterygame.gameobjects.characters.Player;
import java.util.Scanner;
import static com.teksystems.bootcamp.mysterygame.gameobjects.rooms.Map.getMap;


public class Game
{
    protected static Player player;


    static void initGame() {
        displayInstructions();
        new Map();
        player = new Player("You", "Detective", "Solves crimes. Never seems to get a day off.", true);
        player.setCurrentRoom(getMap().get(0));
        player.getCurrentRoom().setCharacters(new Actor("Dayra", "Professional Chef", "Warm and kind friend, always wants to cook for you.", false));
        // Debug Line

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
            output = ProcessInput.processCommands(input);
            System.out.println("You entered '" + output + "'");
        } while (!"q".equals(input));
    }

    static void displayInstructions() {
        System.out.println(
                "\n......................................................................\n" +
                        ".   o   \\ o /  _ o        __|    \\ /     |__         o _  \\ o /   o   .\n" +
                        ".  /|\\    |     /\\   __\\o   \\o    |    o/     o/__   /\\     |    /|\\  .\n" +
                        ".  / \\   / \\   | \\  /) |    ( \\  /o\\  / )    |   (\\  / |   / \\   / \\  .\n" +
                        ".       .......................................................       .\n" +
                        ". \\ o / .                                                     . \\ o / .\n" +
                        ".   |   .                                                     .   |   .\n" +
                        ".  / \\  .             WHAT HAPPENED TO THE MAZE?              .  / \\  .\n" +
                        ".       .                                                     .       .\n" +
                        ".  _ o  .                                                     .  _ o  .\n" +
                        ".   /\\  .     Hello detective! Your friend invited you        .   /\\  .\n" +
                        ".  | \\  .   to a BBQ party! You were having a great time      .  | \\  .\n" +
                        ".       .    until your friend noticed that their favorite    .       .\n" +
                        ".       .    maze puzzle has gone missing from their office!  .       .\n" +
                        ".  __\\o .                                                     .  __\\o .\n" +
                        ". /) |  .    As the only friend at the BBQ who is also a      . /) |  .\n" +
                        ".       .   professional sleuth, it's up to you to solve the  .       .\n" +
                        ". __|   .             mystery in time for dessert!            . __|   .\n" +
                        ".   \\o  .                                                     .    \\o .\n" +
                        ".   ( \\ .                                                     .   ( \\ .\n" +
                        ".       .                                                     .       .\n" +
                        ".  \\ /  .               GAMEPLAY INSTRUCTIONS                 .  \\ /  .\n" +
                        ".   |   .                                                     .   |   .\n" +
                        ".  /o\\  .                                                     .  /o\\  .\n" +
                        ".       .   You'll go around looking for clues in the house.  .       .\n" +
                        ".   |__ .    Using commands to 'go, look, examine or take'    .   |__ .\n" +
                        ". o/    .          items and clues around the house.          . o/    .\n" +
                        "./ )    .                                                     ./ )    .\n" +
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

    void displayCommandList() {}


}
