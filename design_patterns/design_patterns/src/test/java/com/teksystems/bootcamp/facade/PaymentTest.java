package com.teksystems.bootcamp.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PaymentTest {
    /**
     * Method under test: {@link Payment#makePurchase(User, InventoryItem)}
     */
    @Test
    void testMakePurchase() {
        Payment payment = new Payment();

        User user = new User();
        user.setUserAccountAmount(10.0d);
        assertTrue(payment.makePurchase(user, InventoryItem.SHIRT));
        assertEquals(1.0099999999999998d, user.getUserAccountAmount());
    }

    /**
     * Method under test: {@link Payment#makePurchase(User, InventoryItem)}
     */
    @Test
    void testMakePurchase2() {
        Payment payment = new Payment();

        User user = new User();
        user.setUserAccountAmount(0.5d);
        assertFalse(payment.makePurchase(user, InventoryItem.SHIRT));
    }

    /**
     * Method under test: {@link Payment#makePurchase(User, InventoryItem)}
     */
    @Test
    void testMakePurchase3() {
        Payment payment = new Payment();

        User user = new User();
        user.setUserAccountAmount(10.0d);
        assertTrue(payment.makePurchase(user, InventoryItem.PANTS));
        assertEquals(0.009999999999999787d, user.getUserAccountAmount());
    }

    /**
     * Method under test: {@link Payment#makePurchase(User, InventoryItem)}
     */
    @Test
    void testMakePurchase4() {
        Payment payment = new Payment();

        User user = new User();
        user.setUserAccountAmount(10.0d);
        assertTrue(payment.makePurchase(user, InventoryItem.SOCKS));
        assertEquals(6.01d, user.getUserAccountAmount());
    }

    /**
     * Method under test: {@link Payment#makePurchase(User, InventoryItem)}
     */
    @Test
    void testMakePurchase5() {
        Payment payment = new Payment();

        User user = new User();
        user.setUserAccountAmount(10.0d);
        assertFalse(payment.makePurchase(user, InventoryItem.HAT));
    }

    /**
     * Method under test: {@link Payment#makePurchase(User, InventoryItem)}
     */
    @Test
    void testMakePurchase6() {
        Payment payment = new Payment();

        User user = new User();
        user.setUserAccountAmount(10.0d);
        assertFalse(payment.makePurchase(user, InventoryItem.SHOES));
    }

    /**
     * Method under test: {@link Payment#makePurchase(User, InventoryItem)}
     */
    @Test
    void testMakePurchase7() {
        Payment payment = new Payment();

        User user = new User();
        user.setUserAccountAmount(10.0d);
        assertTrue(payment.makePurchase(user, InventoryItem.JEWELERY));
        assertEquals(5.0d, user.getUserAccountAmount());
    }

    /**
     * Method under test: {@link Payment#makePurchase(User, InventoryItem)}
     */
    @Test
    void testMakePurchase8() {
        Payment payment = new Payment();

        User user = new User();
        user.setUserAccountAmount(10.0d);
        assertFalse(payment.makePurchase(user, InventoryItem.NO_ITEM));
    }
}

