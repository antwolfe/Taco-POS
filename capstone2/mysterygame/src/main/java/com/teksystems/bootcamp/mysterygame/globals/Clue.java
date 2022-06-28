package com.teksystems.bootcamp.mysterygame.globals;

public enum Clue {
    JOB_APPLICATION("You see a crumpled job application. A 'John Deere' filled it out."),
    LOTTERY_TICKET("You see a torn lottery ticket."),
    DOG_TOY("What is a dog toy doing here?"),
    PHOTO("There's a photo of a man and a woman"),
    GOOGLE_RESULTS("A Google search is pulled up. Results for 'John Deere' are on the screen"),
    CHICKEN("There's a drumstick here. Look like someone to a bite."),
    ART_MAGAZINE("You find an art magazine in the pile. You know your friend isn't into art."),
    MUD_STAINS("The mud here is in the shape of dog paws."),
    PHONE_CALL("You witness a text conversation between 'Guy' and his wife. It's their anniversary. "),
    DOGFOOD("There is uneaten dog food here."),
    NONE("No clue here.")
    ;
    private final String description;

    Clue(String description) {
        this.description = description;
    }

    public String toString() {
        return this.name().toLowerCase();
    }

    public String getDescription(){
        return this.description;
    }



}
