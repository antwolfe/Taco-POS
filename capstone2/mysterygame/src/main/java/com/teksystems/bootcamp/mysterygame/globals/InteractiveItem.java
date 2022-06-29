package com.teksystems.bootcamp.mysterygame.globals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum InteractiveItem { // TODO: use description as help for finding clues

    TRASHCAN("You know what they say about another's trash...", Clue.LOTTERY_TICKET, Clue.JOB_APPLICATION),
    DESK("A big desk with many drawers. There is a computer on top", Clue.DOG_TOY),
    COMPUTER("A device for searching the internet", Clue.GOOGLE_RESULTS),
    OVEN("There seems to be some food in there", Clue.CHICKEN),
    COUNTER("You see a colorful magazine scattered amongst junk mail", Clue.ART_MAGAZINE), //magazine
    MAT("Weird marks on the mat. Looks like someone tracked in some dirt", Clue.MUD_STAINS), // dirt
    FRIDGE("You open the fridge and see lots of seasoned chicken ready for the grill", Clue.DOGFOOD),
    BBQ_PIT("Something's burning...", Clue.NONE),
    ;
    private final String description;
    private final ArrayList<Clue> clues = new ArrayList<>();


    InteractiveItem(String description, Clue... clues) {
        this.description = description;
        this.clues.addAll(Arrays.asList(clues));
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

    public String getDescription(){
        return this.description;
    }

    public Clue getClue(String word) {
        Clue foundClue = null;
            for (Clue clue : clues) {
                System.out.println(clues);
                if (word.equals(clue.toString())) {
                    foundClue = clue;
                }
            }
            return foundClue;
    }
}


