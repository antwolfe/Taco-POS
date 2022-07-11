package com.teksystems.bootcamp.template;

public abstract class Template {

    final void tellMeAStory() {
        System.out.println(getDay() + " I had " + getFood() + " for " + getMealTime() + " as I was " + getVerb() + " on a " + getFurnitureObject());
        System.out.println("The " + getFood() + "was " + getAdjective() + ", " + getAdjective() + ", and " + getAdjective() + ".");
        System.out.println("As I was " + getVerb() + "on the " + getFurnitureObject() + ", I saw a " + getAdjective() + " " + getAnimal() + " make it's way into the " + getPlace());
        System.out.println("The " + getAdjective() + " " + getPlace() + " was littered with " + getPluralNoun() + " and " + getAdjective() + " " + getAnimals() + ".");
        System.out.println("The " + getAnimal() + " was so " + getAdjective() + " at the amount of " + getAnimals() + " that it attacked all the " + getAnimals() + " at once.");
        System.out.println("It almost worked! But one of the " + getAnimals() + " " + getVerb() + " up and grabbed a " + getAdjective() + " " + getObject() + " that came crashing down onto the " + getAnimal() + "'s head.");
        System.out.println("The cat fainted.");
        System.out.println("I got up and wiped my face with a napkin and finished my lunch.");
    }


    String getDay() {}

    String getFood() {}

    String getNoun() {}

    String getMealTime() {}

    String getVerb() {}

    String getFurnitureObject() {}

    String getObject() {}

    String getAdjective() {}

    String getPlace() {}

    String getAnimal() {}

    String getPluralNoun() {}

    String getAnimals() {}

}
