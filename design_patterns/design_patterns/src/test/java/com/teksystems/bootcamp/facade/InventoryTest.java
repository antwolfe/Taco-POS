package com.teksystems.bootcamp.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InventoryTest {

    // i created these tests
    @Test
    void shouldReturnNullIfItemNotInStockOrInventory() {
        //given
        Inventory inventory = new Inventory();
        //when
        InventoryItem actual = inventory.verifyInventoryItem("hat");
        InventoryItem actual2 = inventory.verifyInventoryItem("jewelery");
        InventoryItem actual3 = inventory.verifyInventoryItem("random");
        //then
        assertNull(actual);
        assertNull(actual2);
        assertNull(actual3);
    }

    @Test
    void shouldReturnItemIfItemInInventoryAndInStock() {
        //given
        Inventory inventory = new Inventory();
        //when
        InventoryItem actual = inventory.verifyInventoryItem("shirt");
        InventoryItem actual2 = inventory.verifyInventoryItem("shoes");
        InventoryItem actual3 = inventory.verifyInventoryItem("pants");
        InventoryItem actual4 = inventory.verifyInventoryItem("jewelery");
        //then
        assertEquals(InventoryItem.SHIRT, actual);
        assertEquals(InventoryItem.SHOES, actual2);
        assertEquals(InventoryItem.PANTS, actual3);
        assertNull(actual4);

    }



    // these tests were created by diffblue
    @Test
    void testVerifyInventoryItem() {
        assertEquals(InventoryItem.SHIRT, (new Inventory()).verifyInventoryItem("shirt"));
        assertEquals(InventoryItem.PANTS, (new Inventory()).verifyInventoryItem("pants"));
        assertNull((new Inventory()).verifyInventoryItem("socks"));
        assertEquals(InventoryItem.SHOES, (new Inventory()).verifyInventoryItem("shoes"));
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