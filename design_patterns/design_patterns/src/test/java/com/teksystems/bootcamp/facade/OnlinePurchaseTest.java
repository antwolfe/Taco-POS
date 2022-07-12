package com.teksystems.bootcamp.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class OnlinePurchaseTest {

    // these tests were created by diffblue

    @Test
    void testMakeOnlinePurchase3() {
        OnlinePurchase onlinePurchase = new OnlinePurchase();
        onlinePurchase.makeOnlinePurchase("shirt");
        assertTrue(onlinePurchase.paymentOk);
        assertEquals(InventoryItem.SHIRT, onlinePurchase.itemToPurchase);
        assertEquals(41.01d, onlinePurchase.user.getUserAccountAmount());
    }

    @Test
    void testMakeOnlinePurchase5() {
        OnlinePurchase onlinePurchase = new OnlinePurchase();
        onlinePurchase.makeOnlinePurchase("shoes");
        assertFalse(onlinePurchase.paymentOk);
        assertEquals(InventoryItem.SHOES, onlinePurchase.itemToPurchase);
    }
}

