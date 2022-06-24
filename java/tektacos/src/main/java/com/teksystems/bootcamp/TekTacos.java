package com.teksystems.bootcamp;


public class TekTacos implements Menu {

    public static void main(String[] args) {
        Order newOrder = new Order();
        Order finalOrder = newOrder.fromMainMenu(newOrder);
        finalOrder.print();
    }


}
