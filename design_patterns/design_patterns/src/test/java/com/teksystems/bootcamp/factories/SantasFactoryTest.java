package com.teksystems.bootcamp.factories;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SantasFactoryTest {

    @Test
    void testMakeGift() {
        //given
        SantasFactory factory = new SantasFactory();
        String naughty = "naughty";
        String nice = "nice";

        //when
        String actual = factory.makeGift(naughty).getGift();
        String actual2 = factory.makeGift(nice).getGift();

        //then
        assertEquals(" gets coal!", actual);
        assertEquals(" gets a toy!", actual2);
    }
}