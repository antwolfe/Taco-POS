package com.teksystems.bootcamp.factories;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SantasFactoryTest {

    SantasFactory factory = new SantasFactory();
    Gift gift;
    String naughty = "naughty";
    String nice = "nice";

    @Test
    public void givenNiceMakeGiftReturnsToy() {
        SantasFactory factory = new SantasFactory();
        String nice = "nice";
        Gift expected = new Toy();
        Gift actual = factory.makeGift(nice);
        assertEquals(expected, actual);
        //  need to compare same object? different assert?
    }

    /**
     * Method under test: {@link SantasFactory#makeGift(String)}
     */
    @Test
    void testMakeGift() {
        assertEquals(" gets coal!", (new SantasFactory()).makeGift("Status").getGift());
        assertEquals(" gets a toy!", (new SantasFactory()).makeGift((String) "nice").getGift());
    }

    @Test
    void givenNaughtyMakeGiftReturnsCoal() {
        SantasFactory factory = new SantasFactory();
        String naughty = "naughty";
        Gift expected = new Coal();
        Gift actual = factory.makeGift(naughty);
        assertEquals(expected, actual);
    }
}