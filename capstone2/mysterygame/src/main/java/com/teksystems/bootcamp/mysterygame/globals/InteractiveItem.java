package com.teksystems.bootcamp.mysterygame.globals;


public enum InteractiveItem { // TODO: use description as help for finding clues

    TRASHCAN("You know what they say about another's trash...", Clue.LOTTERY_TICKET),
    DESK("A big desk with many drawers. There is a computer on top", Clue.DOG_TOY),
    COMPUTER("A device for searching the internet", Clue.GOOGLE_RESULTS),
    OVEN("There seems to be some food in there", Clue.CHICKEN),
    COUNTER("You see a colorful magazine scattered amongst junk mail", Clue.ART_MAGAZINE),
    MAT("Weird marks on the mat. Looks like someone tracked in some dirt", Clue.MUD_STAINS),
    FRIDGE("You open the fridge and see lots of seasoned chicken ready for the grill", Clue.DOGFOOD),
    BBQ_PIT("Fixed in small holes in the dirt. Lots of coals burning", Clue.NONE),
    ;
    private final String description;
    private final Clue clue;


    InteractiveItem(String description, Clue clue) {
        this.description = description;
        this.clue = clue;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

    public String getDescription(){
        return this.description;
    }

    public Clue examineItem() { return this.clue; }
}


