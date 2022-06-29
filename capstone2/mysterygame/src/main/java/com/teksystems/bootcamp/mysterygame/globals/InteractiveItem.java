package com.teksystems.bootcamp.mysterygame.globals;


import java.util.ArrayList;
import java.util.Arrays;

public enum InteractiveItem { // TODO: use description as help for finding clues

    TRASHCAN("You know what they say about another's trash...", "trash",
            Clue.LOTTERY_TICKET, Clue.JOB_APPLICATION),
    DESK("A big desk with many drawers. There is a computer on top", "toy",
            Clue.DOG_TOY),
    COMPUTER("A device for searching the internet", "results",
            Clue.GOOGLE_RESULTS),
    OVEN("There seems to be some food in there", "chicken",
            Clue.CHICKEN),
    COUNTER("You see a colorful magazine scattered amongst junk mail", "magazine",
            Clue.ART_MAGAZINE), //magazine
    MAT("Weird marks on the mat. Looks like someone tracked in some dirt", "dirt",
            Clue.MUD_STAINS), // dirt
    FRIDGE("You open the fridge and see lots of seasoned chicken ready for the grill", "food",
            Clue.DOGFOOD),
    BBQ_PIT("Something's burning...the BBQ forgotten for now.", "burning",
            Clue.NONE),
    ;
    private final String description;
    private final ArrayList<Clue> clues = new ArrayList<>();
    private final String clueKeyword;


    InteractiveItem(String description, String clueKeyword, Clue... clues) {
        this.description = description;
        this.clueKeyword = clueKeyword;
        this.clues.addAll(Arrays.asList(clues));
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

    public String getDescription(){
        return this.description;
    }

    public void displayClue() {
            for (Clue clue : clues) {
                System.out.println(clue.getDescription());
            }
    }

    public String getClueKeyword() {
        return this.clueKeyword;
    }

}


