package com.teksystems.bootcamp;


public class TekTacos implements Menu {

    public static void main(String[] args) {

        //while (user keeps pressing y to order))
        Order newOrder = new Order();
//       newOrder.fromMainMenu(newOrder, choice);
        Order finalOrder = newOrder.fromMainMenu(newOrder);
        finalOrder.print();
    }


}
