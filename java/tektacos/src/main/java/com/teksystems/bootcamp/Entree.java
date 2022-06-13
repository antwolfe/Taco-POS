package com.teksystems.bootcamp;

public class Entree {

        String tacoType;
        Tortilla tortillaType;
        String proteinType;
        String[] toppingsList;

    Entree(String tacoInput) {
        this.tacoType = tacoInput;
        this.tortillaType = new Tortilla();
}

    public void createTacoOrder(String tacoType) {
        if (tacoType.equals("basic")) {
            System.out.println("Basic taco started.");
           tortillaType.displayChosenTortilla(tortillaType.chooseTortilla());

        }
    }

    public void makeBasicTaco(String tortillaType, String proteinType) {
//        this.tortillaType = tortilla;
//        this.proteinType = protein;
    }

    protected void makeDeluxeTaco() {

    }

    protected void makeVeggieTaco() {

    }


}
