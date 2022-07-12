package com.teksystems.bootcamp.template;

public abstract class Template {

    final void tellMeAStory() {
        System.out.println(getDay() + " I had " + getFood() + " for " + getMealTime() + " as I " + getPastTenseVerb() + " on a " + getFurnitureObject());
        System.out.println("The " + getFood() + " was " + getAdjective() + ", " + getAdjective() + ", and " + getAdjective() + ".");
        System.out.println("As I " + getPastTenseVerb() + " on the " + getFurnitureObject() + ", I saw a " + getColor() + " " + getSameAnimal() + " make it's way into the " + getPlace()+ ".");
        System.out.println("The " + getAdjective() + " " + getPlace() + " was littered with " + getPluralObject() + " and " + getAdjective() + " " + getAnimals() + ".");
        System.out.println("The " + getSameAnimal() + " was so " + getEmotion() + " at the amount of " + getAnimals() + " that it attacked all the " + getSameAnimals() + " at once.");
        System.out.println("It almost worked! But one of the " + getSameAnimals() + " " + getPastTenseVerb() + " up and grabbed a " + getAdjective() + " " + getObject() + " that came crashing down onto the " + getSameAnimal() + "'s head.");
        System.out.println("The " + getSameAnimal() + " fainted.");
        System.out.println("I got up and wiped my face with a napkin and finished my " + getSameMealTime() + ".");
    }


    abstract String getDay();

    abstract String getFood();

    abstract String getMealTime();

    abstract String getPastTenseVerb();

    abstract String getFurnitureObject();

    abstract String getObject();

    abstract String getAdjective();

    abstract String getPlace();

    abstract String getColor();

    abstract String getAnimal();

    abstract String getSameAnimal();

    abstract String getPluralObject();

    abstract String getAnimals();

    abstract String getSameAnimals();

    abstract String getEmotion();

    abstract String getSameMealTime();
}
