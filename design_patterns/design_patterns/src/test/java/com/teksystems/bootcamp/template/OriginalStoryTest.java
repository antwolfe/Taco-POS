package com.teksystems.bootcamp.template;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OriginalStoryTest {


    @Test
    void testConstructor() {
        OriginalStory actualOriginalStory = new OriginalStory();
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

