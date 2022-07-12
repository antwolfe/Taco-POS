package com.teksystems.bootcamp.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class OnlinePurchaseTest {
    /**
     * Method under test: {@link OnlinePurchase#makeOnlinePurchase(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMakeOnlinePurchase() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.teksystems.bootcamp.facade.Payment.makePurchase(Payment.java:7)
        //       at com.teksystems.bootcamp.facade.OnlinePurchase.makeOnlinePurchase(OnlinePurchase.java:19)
        //   In order to prevent makeOnlinePurchase(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   makeOnlinePurchase(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new OnlinePurchase()).makeOnlinePurchase("Item");
    }

    /**
     * Method under test: {@link OnlinePurchase#makeOnlinePurchase(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMakeOnlinePurchase2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.teksystems.bootcamp.facade.Payment.makePurchase(Payment.java:7)
        //       at com.teksystems.bootcamp.facade.OnlinePurchase.makeOnlinePurchase(OnlinePurchase.java:19)
        //   In order to prevent makeOnlinePurchase(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   makeOnlinePurchase(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new OnlinePurchase()).makeOnlinePurchase("foo");
    }

    /**
     * Method under test: {@link OnlinePurchase#makeOnlinePurchase(String)}
     */
    @Test
    void testMakeOnlinePurchase3() {
        OnlinePurchase onlinePurchase = new OnlinePurchase();
        onlinePurchase.makeOnlinePurchase("shirt");
        assertTrue(onlinePurchase.paymentOk);
        assertEquals(InventoryItem.SHIRT, onlinePurchase.itemToPurchase);
        assertEquals(41.01d, onlinePurchase.user.getUserAccountAmount());
    }

    /**
     * Method under test: {@link OnlinePurchase#makeOnlinePurchase(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMakeOnlinePurchase4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.teksystems.bootcamp.facade.Payment.makePurchase(Payment.java:7)
        //       at com.teksystems.bootcamp.facade.OnlinePurchase.makeOnlinePurchase(OnlinePurchase.java:19)
        //   In order to prevent makeOnlinePurchase(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   makeOnlinePurchase(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new OnlinePurchase()).makeOnlinePurchase("socks");
    }

    /**
     * Method under test: {@link OnlinePurchase#makeOnlinePurchase(String)}
     */
    @Test
    void testMakeOnlinePurchase5() {
        OnlinePurchase onlinePurchase = new OnlinePurchase();
        onlinePurchase.makeOnlinePurchase("shoes");
        assertFalse(onlinePurchase.paymentOk);
        assertEquals(InventoryItem.SHOES, onlinePurchase.itemToPurchase);
    }
}

