package com.teksystems.bootcamp.template;

import java.util.Random;

public class MadLibStory extends Template {
    Random rand = new Random();
    int randInt;

    @Override
    String getDay() {
        String[] days = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday", "Yesterday", "Today"};
        int dayLimit = days.length;
        randInt = rand.nextInt(dayLimit);
        return days[randInt];
    }

    @Override
    String getFood() {
        String[] foods = {"bread", "fruit", "sandwich", "cheeseburger"};
        int foodLimit = foods.length;
        randInt = rand.nextInt(foodLimit);
        return foods[randInt];
    }

    @Override
    String getMealTime() {
        String[] mealTimes = {"lunch", "dinner", "breakfast", "brunch", "linner"};
        int mealTimesLimit = mealTimes.length;
        randInt = rand.nextInt(mealTimesLimit);
        return mealTimes[randInt];
    }

    @Override
    String getPastTenseVerb() {
        String[] verbs = {"jumped", "skipped", "grabbed", "pushed", "ran"};
        int verbLimit = verbs.length;
        randInt = rand.nextInt(verbLimit);
        return verbs[randInt];
    }

    @Override
    String getVerb() {
        return null;
    }

    @Override
    String getFurnitureObject() {
        String[] furnitureObjects = {"bench", "chair", "couch", "table", "stool"};
        int furnitureLimit = furnitureObjects.length;
        randInt = rand.nextInt(furnitureLimit);
        return furnitureObjects[randInt];
    }

    @Override
    String getObject() {
        String[] objects = {"streetlamp", "book", "laptop", "car"};
        int objectLimit = objects.length;
        randInt = rand.nextInt(objectLimit);
        return objects[randInt];
    }

    @Override
    String getAdjective() {
        String[] adjectives = {"big", "fat", "small", "large", "kind", "rigid", "hard", "beautiful"};
        int adjectiveLimit = adjectives.length;
        randInt = rand.nextInt(adjectiveLimit);
        return adjectives[randInt];
    }


    @Override
    String getPlace() {
        String[] places = {"street", "alley", "road", "bar", "house"};
        int placeLimit = places.length;
        randInt = rand.nextInt(placeLimit);
        return places[randInt];
    }

    @Override
    String getColor() {
        String[] colors = {"blue", "red", "orange", "black", "grey", "magenta", "rainbow"};
        int colorLimit = colors.length;
        randInt = rand.nextInt(colorLimit);
        return colors[randInt];
    }

    @Override
    String getAnimal() {
        String[] animalsSingle = {"dog", "whale", "raccoon", "jackal", "liger", "hippo"};
        int animalsSingleLimit = animalsSingle.length;
        randInt = rand.nextInt(animalsSingleLimit);
        final int animal = randInt;
        return animalsSingle[animal];
    }

    @Override
    String getPluralObject() {
        String[] pluralObjects = {"bicycles", "lamps", "golf balls", "kites", "pools"};
        int pluralObjectsLimit = pluralObjects.length;
        randInt = rand.nextInt(pluralObjectsLimit);
        return pluralObjects[randInt];
    }

    @Override
    String getAnimals() {
        String[] animalsPlural = {"gophers", "beetles", "hedgehogs", "eagles", "lions"};
        int animalsPluralLimit = animalsPlural.length;
        randInt = rand.nextInt(animalsPluralLimit);
        return animalsPlural[randInt];
    }

    @Override
    String getEmotion() {
        return null;
    }
}
