package com.teksystems.bootcamp;

import java.util.Scanner;

public class Print {

    public static void mainMenu() {

        System.out.println(" ----MENU---- ");
        System.out.println("===============");
        System.out.println("1. Entrees");
        System.out.println("2. Sides");
        System.out.println("3. Drinks");
        System.out.println("4. Combo");
        System.out.println("===============");
    }

    public static void entreeMenu() {
        System.out.println(" ----ENTREES---- ");
        System.out.println("===============");
        System.out.println("1. Basic Taco");
        System.out.println("2. Deluxe Taco");
        System.out.println("3. Veggie Taco");
        System.out.println("===============");
    }



    static void subMenu(int choice) {
        switch (choice) {
            case 1:
                System.out.println("You chose Entrees");
                entreeMenu();
                int entreeChoice = makeOrder.setUserChoice();
                pickEntree(entreeChoice);
                break;
//            case 2:
//                System.out.println("Sides");
//                return 2;
//            case 3:
//                System.out.println("Drinks");
//                return 3;
//            case 4:
//                System.out.println("Combo");
//                return 4;
            default:
                System.out.println("basic taco meal");

        }
    }

    public static void pickEntree(int subMenuChoice) {
        switch (subMenuChoice) {
            case 1:
                makeOrder newBasicTaco = new makeOrder();
                newBasicTaco.makeBasicTaco();
                return;
//            case 2:
//                makeOrder.makeDeluxeTaco();
//            case 3:
//                makeOrder.makeVeggieTaco();
            default:
                System.out.println("no taco picked");
        }
    }

}
