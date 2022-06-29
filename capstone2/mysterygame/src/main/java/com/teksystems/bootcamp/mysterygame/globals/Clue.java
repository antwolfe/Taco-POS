package com.teksystems.bootcamp.mysterygame.globals;

public enum Clue { // TODO: add keywords from InteractiveItems
    MUD_STAINS("The mud here is in the shape of dog paws.", "none"), // dirt
    CHICKEN("There's a drumstick here. Look like someone took a bite.", "none"),
    DOG_FOOD("There is uneaten dog food here.", "food"),
    PHONE_CALL("You witness a phone conversation between 'Guy' and his wife. It's their anniversary.", "witness"), // listen
    DOG_TOY("What is a dog toy doing in here?", "toy"),
    PHOTO("There's a photo of a man and a woman", "photo"),
    GOOGLE_RESULTS("A Google search is pulled up. Results for 'Does the butler always do it?' are on the screen", "screen"),
    ART_MAGAZINE("You find an art magazine in the pile. You know your friend isn't into art.", "magazine"),
    JOB_APPLICATION("You see a crumpled job application. The butler filled it out.", "application"),
    LOTTERY_TICKET("You see a torn lottery ticket.", "ticket"),
    NONE("No clue here.", "none")
    ;
    private final String description;
    private final String takeKeyword;


    Clue(String description, String takeKeyword) {
        this.description = description;
        this.takeKeyword = takeKeyword;
    }

    public String toString() {
        return this.name().toLowerCase();
    }

    public String getDescription(){
        return this.description;
    }

    public String getTakeKeyword() {
        return this.takeKeyword;
    }
}
