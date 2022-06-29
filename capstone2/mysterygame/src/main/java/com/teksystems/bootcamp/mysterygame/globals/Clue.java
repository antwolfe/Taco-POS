package com.teksystems.bootcamp.mysterygame.globals;

public enum Clue { // TODO: add keywords from InteractiveItems
    JOB_APPLICATION("You see a crumpled job application. A 'John Deere' filled it out.", "applcation"),
    LOTTERY_TICKET("You see a torn lottery ticket.", "ticket"),
    DOG_TOY("What is a dog toy doing here?", "toy"),
    PHOTO("There's a photo of a man and a woman", "photo"),
    GOOGLE_RESULTS("A Google search is pulled up. Results for 'John Deere' are on the screen", "screen"),
    CHICKEN("There's a drumstick here. Look like someone took a bite.", "none"),
    ART_MAGAZINE("You find an art magazine in the pile. You know your friend isn't into art.", "magazine"),
    MUD_STAINS("The mud here is in the shape of dog paws.", "none"), // dirt
    PHONE_CALL("You witness a phone conversation between 'Guy' and his wife. It's their anniversary.", "witness"), // listen
    DOGFOOD("There is uneaten dog food here.", "food"),
    NONE("No clue here.", "none")
    ;
    private final String description;
    private String takeKeyword;



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

    public void getClue () {

    }



}
