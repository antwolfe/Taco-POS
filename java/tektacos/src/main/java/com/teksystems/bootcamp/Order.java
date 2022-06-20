package com.teksystems.bootcamp;

import java.util.ArrayList;

public class Order implements TakeOrder {
    ArrayList<MenuItem> orderList;

    public Order() {
        this.orderList = new ArrayList<>();
    }

    public void addItemToOrder(MenuItem item) {
        orderList.add(item);
    }

    public void print() {
        double total = 0;
        for (MenuItem item : orderList) {
            System.out.println(item.getDescription() + " --> " + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Your total is: $" + total ); //two decimal points
    }

}

