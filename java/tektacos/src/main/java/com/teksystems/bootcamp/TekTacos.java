package com.teksystems.bootcamp;


public class TekTacos {

    public static void displayWelcome() {
        System.out.println();
        System.out.println("WELCOME TO TEKTACOS");
        System.out.println("please choose a number below");
        System.out.println();
    }


    public static void main(String[] args) {
        displayWelcome();
        Print.mainMenu();
        int menuChoice = makeOrder.setUserChoice();
        //communication logic
        Print.subMenu(menuChoice);
//        makeOrder.startOrder(menuChoice);



    }


}
