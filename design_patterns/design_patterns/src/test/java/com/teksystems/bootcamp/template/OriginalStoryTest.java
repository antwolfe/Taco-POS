package com.teksystems.bootcamp.template;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OriginalStoryTest {
    /**
     * Method under test: {@link OriginalStory#getSameAnimal()}
     */
    @Test
    void testGetSameAnimal() {
        assertEquals("cat", (new OriginalStory()).getSameAnimal());
    }

    /**
     * Method under test: {@link OriginalStory#getSameAnimals()}
     */
    @Test
    void testGetSameAnimals() {
        assertEquals("birds", (new OriginalStory()).getSameAnimals());
    }

    /**
     * Method under test: {@link OriginalStory#getSameMealTime()}
     */
    @Test
    void testGetSameMealTime() {
        assertEquals("lunch", (new OriginalStory()).getSameMealTime());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link OriginalStory}
     *   <li>{@link OriginalStory#getAdjective()}
     *   <li>{@link OriginalStory#getAnimal()}
     *   <li>{@link OriginalStory#getAnimals()}
     *   <li>{@link OriginalStory#getColor()}
     *   <li>{@link OriginalStory#getDay()}
     *   <li>{@link OriginalStory#getEmotion()}
     *   <li>{@link OriginalStory#getFood()}
     *   <li>{@link OriginalStory#getFurnitureObject()}
     *   <li>{@link OriginalStory#getMealTime()}
     *   <li>{@link OriginalStory#getObject()}
     *   <li>{@link OriginalStory#getPastTenseVerb()}
     *   <li>{@link OriginalStory#getPlace()}
     *   <li>{@link OriginalStory#getPluralObject()}
     * </ul>
     */
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

