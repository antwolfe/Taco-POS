package com.teksystems.bootcamp.factories;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void givenNaughtyMakeGiftReturnsCoal() {
        SantasFactory factory = new SantasFactory();
        String naughty = "naughty";
        Gift expected = new Coal();
        Gift actual = factory.makeGift(naughty);
        assertEquals(expected, actual);
    }
}