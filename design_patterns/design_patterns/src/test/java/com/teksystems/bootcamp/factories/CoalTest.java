package com.teksystems.bootcamp.factories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CoalTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Coal}
     *   <li>{@link Coal#getGift()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertEquals(" gets coal!", (new Coal()).getGift());
    }
}

