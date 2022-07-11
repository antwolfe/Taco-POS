package com.teksystems.bootcamp.template;

public abstract class Template {

    final void tellMeAStory() {
        System.out.println(getDay() + " I had " + getFood() + " for " + getMealTime() + " as I was " + getVerb() + " on a " + getFurnitureObject());
        System.out.println("The " + getFood() + "was " + getAdjective() + ", " + getAdjective() + ", and " + getAdjective() + ".");
        System.out.println("As I was looking out of the window,  I saw a gray cat make it's way into the alley.");
        System.out.println("The dark alley was littered with bread and fat birds.");
        System.out.println("The cat was so surprised at the amount of birds that it attacked all the birds at once.");
        System.out.println("It almost worked! But one of the birds flew up and grabbed a rickety streetlamp that came crashing down onto the cats head.");
        System.out.println("The cat fainted.");
        System.out.println("I got up and wiped my face with a napkin and finished my lunch.");
    }

    String getDay() {

    }

    String getFood() {}

    String getNoun() {}

    String getMealTime() {}

    String getVerb() {}

    String getFurnitureObject() {}

    String getObject() {}

    String getAdjective() {}

    String getPlace() {}

    String getAnimal() {}


}
