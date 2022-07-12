package com.teksystems.bootcamp.template;

public abstract class Template {

    final void tellMeAStory() {
        System.out.println(getDay() + " I had " + getFood() + " for lunch as I " + getPastTenseVerb() + " on a " + getFurnitureObject() + ".");
        System.out.println("I had " + getFood() + " and they were " + getAdjective1() + ", " + getAdjective2() + ", and " + getAdjective3() + ".");
        System.out.println("As I ate, I saw a " + getColor() + " liger make it's way into the " + getPlace() + ".");
        System.out.println("It was littered with " + getPluralObject() + " and " + getAdjective4() + " birds.");
        System.out.println("The liger was so " + getEmotion() + " at the amount of birds that it attacked all the birds at once.");
        System.out.println("It almost worked! But one of the birds " + getPastTenseVerb() + " up and grabbed a rickety " + getObject() + " that came crashing down onto the liger's head.");
        System.out.println("The liger fainted.");
        System.out.println("I got up and wiped my face with a napkin and finished my lunch.");
    }

    abstract String getAdjective4();

    abstract String getAdjective3();

    abstract String getAdjective2();

    abstract String getAdjective1();

    abstract String getDay();

    abstract String getFood();

    abstract String getMealTime();

    abstract String getPastTenseVerb();

    abstract String getFurnitureObject();

    abstract String getObject();

    abstract String getPlace();

    abstract String getColor();

    abstract String getPluralObject();

    abstract String getAnimals();

    abstract String getEmotion();

}
