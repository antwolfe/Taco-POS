package com.teksystems.bootcamp.template;

import java.util.Arrays;

public class OriginalStory extends Template {

    String[] adjectiveList = {"warm", "soft", "fluffy", "fat", "rickety"};
    int adjectiveCount = 0;

    @Override
    String getDay() {
        return "Today";
    }

    @Override
    String getFood() {
        return "biscuits";
    }

    @Override
    String getMealTime() {
        return "lunch";
    }

    @Override
    String getPastTenseVerb() {
        return "sitting";
    }

    @Override
    String getVerb() {
        return "ate";
    }

    @Override
    String getFurnitureObject() {
        return "window";
    }

    @Override
    String getObject() {
        return "streetlamp";
    }

    void setAdjective() { adjectiveCount++;}

    @Override
    String getAdjective() {
        return "warm";
    }

    @Override
    String getPlace() {
        return "alley";
    }

    @Override
    String getColor() {
        return "grey";
    }

    @Override
    String getAnimal() {
        return "cat";
    }

    @Override
    String getPluralNoun() {
        return "bread";
    }

    @Override
    String getAnimals() {
        return "birds";
    }

    @Override
    String getEmotion() {
        return "surprised";
    }
}
