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


    public int getOrderList() {
        return orderList.size();
    }


    public void print() {
        double total = 0;
        for (MenuItem item : orderList) {
            System.out.println(item.getDescription() + " --> " + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Your total is: $" + total );
    }


//    public void printReceipt(Order order) {
//        System.out.println("Here is your order: ");
//        System.out.println(tacoType + " taco with " + tacoProtein + ",");
//        for (String topping : tacoToppings) {
//            System.out.print(topping + ", ");
//        }
//        System.out.println("on a " + tacoTortilla + " tortilla.");
//        System.out.println();
//        System.out.println(sideType + " for sides.");
//        System.out.println("A " + drinkType + " to drink.");
//    }


}

