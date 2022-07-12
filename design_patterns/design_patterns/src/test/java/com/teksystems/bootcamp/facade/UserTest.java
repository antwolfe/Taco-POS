package com.teksystems.bootcamp.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link User}
     *   <li>{@link User#setUserAccountAmount(double)}
     *   <li>{@link User#getAddress()}
     *   <li>{@link User#getUserAccountAmount()}
     * </ul>
     */
    @Test
    void testConstructor() {
        User actualUser = new User();
        actualUser.setUserAccountAmount(10.0d);
        assertEquals("1234 Britton Rd,\n St.Ave City,\n Michigan 20430", actualUser.getAddress());
        assertEquals(10.0d, actualUser.getUserAccountAmount());
    }
}

