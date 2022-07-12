package com.teksystems.bootcamp.template;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OriginalStoryTest {

    //
    @Test
    void testGetSameAnimal() {
        assertEquals("cat", (new OriginalStory()).getSameAnimal());
    }

    @Test
    void testGetSameAnimals() {
        assertEquals("birds", (new OriginalStory()).getSameAnimals());
    }

    @Test
    void testGetSameMealTime() {
        assertEquals("lunch", (new OriginalStory()).getSameMealTime());
    }

    @Test
    void testConstructor() {
        OriginalStory actualOriginalStory = new OriginalStory();
        assertEquals("warm", actualOriginalStory.getAdjective());
        assertEquals("cat", actualOriginalStory.getAnimal());
        assertEquals("birds", actualOriginalStory.getAnimals());
        assertEquals("grey", actualOriginalStory.getColor());
        assertEquals("Today", actualOriginalStory.getDay());
        assertEquals("surprised", actualOriginalStory.getEmotion());
        assertEquals("biscuits", actualOriginalStory.getFood());
        assertEquals("window", actualOriginalStory.getFurnitureObject());
        assertEquals("lunch", actualOriginalStory.getMealTime());
        assertEquals("streetlamp", actualOriginalStory.getObject());
        assertEquals("sitting", actualOriginalStory.getPastTenseVerb());
        assertEquals("alley", actualOriginalStory.getPlace());
        assertEquals("bread", actualOriginalStory.getPluralObject());
    }
}

