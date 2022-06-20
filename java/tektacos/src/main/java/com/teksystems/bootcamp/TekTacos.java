package com.teksystems.bootcamp;


public class TekTacos implements Menu {

    public static void main(String[] args) {

        //while (user keeps pressing y to order))
        Menu.mainMenu();
        Order newOrder = new Order();
        int choice = newOrder.getUserInput();
        newOrder.fromMainMenu(newOrder, choice);
        // newOrder.add(newOrder)

    }


}
