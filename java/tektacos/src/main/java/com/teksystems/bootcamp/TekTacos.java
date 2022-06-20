package com.teksystems.bootcamp;


public class TekTacos implements Menu {

    public static void main(String[] args) {

        Menu.mainMenu();
        Order newOrder = new Order();
        int choice = newOrder.getUserInput();
        newOrder.fromMainMenu(newOrder, choice);


    }


}
