package com.teksystems.bootcamp.mysterygame;

import com.teksystems.bootcamp.mysterygame.gameobjects.characters.Player;
import com.teksystems.bootcamp.mysterygame.globals.Clue;

import static com.teksystems.bootcamp.mysterygame.Game.player;

public class InputValidator {

    public static boolean isValidClueToTake(String pickedClue) {
        for (Clue clue : player.getCurrentRoom().getCluesInRoom()) {
            if (pickedClue.equals(clue.getTakeKeyword())) {
                return true;
            }
        }
      return false;
    }

}
