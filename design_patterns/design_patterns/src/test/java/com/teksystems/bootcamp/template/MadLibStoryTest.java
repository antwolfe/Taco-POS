package com.teksystems.bootcamp.template;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MadLibStoryTest {
    /**
     * Method under test: {@link MadLibStory#getDay()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetDay() {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        (new MadLibStory()).getDay();
    }

    /**
     * Method under test: {@link MadLibStory#getFood()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFood() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        MadLibStory madLibStory = null;

        // Act
        String actualFood = madLibStory.getFood();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MadLibStory#getMealTime()}
     */
    @Test
    void testGetMealTime() {
        MadLibStory madLibStory = new MadLibStory();
        madLibStory.getMealTime();
        assertEquals("sandwich", madLibStory.getFood());
    }

    /**
     * Method under test: {@link MadLibStory#getPastTenseVerb()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPastTenseVerb() {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        (new MadLibStory()).getPastTenseVerb();
    }

    /**
     * Method under test: {@link MadLibStory#getFurnitureObject()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetFurnitureObject() {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        (new MadLibStory()).getFurnitureObject();
    }

    /**
     * Method under test: {@link MadLibStory#getObject()}
     */
    @Test
    void testGetObject() {
        MadLibStory madLibStory = new MadLibStory();
        madLibStory.getObject();
        assertEquals("bread", madLibStory.getFood());
    }

    /**
     * Method under test: {@link MadLibStory#getAdjective()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAdjective() {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        (new MadLibStory()).getAdjective();
    }

    /**
     * Method under test: {@link MadLibStory#getPlace()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPlace() {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        (new MadLibStory()).getPlace();
    }

    /**
     * Method under test: {@link MadLibStory#getColor()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetColor() {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        (new MadLibStory()).getColor();
    }

    /**
     * Method under test: {@link MadLibStory#getAnimal()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAnimal() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        MadLibStory madLibStory = null;

        // Act
        String actualAnimal = madLibStory.getAnimal();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MadLibStory#getSameAnimal()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSameAnimal() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        MadLibStory madLibStory = null;

        // Act
        String actualSameAnimal = madLibStory.getSameAnimal();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MadLibStory#getPluralObject()}
     */
    @Test
    void testGetPluralObject() {
        MadLibStory madLibStory = new MadLibStory();
        madLibStory.getPluralObject();
        assertEquals("sandwich", madLibStory.getFood());
    }

    /**
     * Method under test: {@link MadLibStory#getAnimals()}
     */
    @Test
    void testGetAnimals() {
        MadLibStory madLibStory = new MadLibStory();
        madLibStory.getAnimals();
        assertEquals("linner", madLibStory.getMealTime());
    }

    /**
     * Method under test: {@link MadLibStory#getSameAnimals()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSameAnimals() {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        (new MadLibStory()).getSameAnimals();
    }

    /**
     * Method under test: {@link MadLibStory#getEmotion()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEmotion() {
        // TODO: Complete this test.
        //   Reason: R015 Method may be nondeterministic.
        //   The execution of the created test may depend on the runtime environment.
        //   See https://diff.blue/R015 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        MadLibStory madLibStory = null;

        // Act
        String actualEmotion = madLibStory.getEmotion();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link MadLibStory#getSameMealTime()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSameMealTime() {
        // TODO: Complete this test.
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        (new MadLibStory()).getSameMealTime();
    }
}

