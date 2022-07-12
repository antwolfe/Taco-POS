package com.teksystems.bootcamp.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InventoryTest {

    @Test
    void testVerifyInventoryItem() {
        assertNull((new Inventory()).verifyInventoryItem("Item To Purchase"));
        assertEquals(InventoryItem.SHIRT, (new Inventory()).verifyInventoryItem("shirt"));
        assertEquals(InventoryItem.PANTS, (new Inventory()).verifyInventoryItem("pants"));
        assertNull((new Inventory()).verifyInventoryItem("socks"));
        assertEquals(InventoryItem.SHOES, (new Inventory()).verifyInventoryItem("shoes"));
    }

    @Test
    void shouldReturnItemIfInInventory() {
        Inventory inventory = new Inventory();
        InventoryItem actual = inventory.verifyInventoryItem("hat");
        assertNull(actual);
    }


    @Test
    void testIsItemInStock() {
        assertTrue((new Inventory()).isItemInStock(InventoryItem.SHIRT));
        assertFalse((new Inventory()).isItemInStock(null));
        assertTrue((new Inventory()).isItemInStock(InventoryItem.PANTS));
        assertFalse((new Inventory()).isItemInStock(InventoryItem.SOCKS));
        assertFalse((new Inventory()).isItemInStock(InventoryItem.HAT));
        assertTrue((new Inventory()).isItemInStock(InventoryItem.SHOES));
        assertFalse((new Inventory()).isItemInStock(InventoryItem.JEWELERY));
        assertFalse((new Inventory()).isItemInStock(InventoryItem.NO_ITEM));
    }


}