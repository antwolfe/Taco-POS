package com.teksystems.bootcamp.factories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ToyTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Toy}
     *   <li>{@link Toy#getGift()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertEquals(" gets a toy!", (new Toy()).getGift());
    }
}

