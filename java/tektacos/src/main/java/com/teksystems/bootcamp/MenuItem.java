package com.teksystems.bootcamp;

public interface MenuItem {

    Double price = 0.00;
    String item = null;

    double getPrice();

    String getDescription();

    default void customizeItem(Order theOrder, MenuItem item) {

    }
}
