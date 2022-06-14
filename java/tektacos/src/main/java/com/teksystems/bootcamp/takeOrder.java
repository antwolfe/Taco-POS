package com.teksystems.bootcamp;

import java.util.Scanner;


public class takeOrder {

    public static int userChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Choice: ");
        return scanner.nextInt();
    }

    static void subMenu(int choice) {
        switch (choice) {
            case 1:
                System.out.println("You chose Entrees");
                Print.entreeMenu();
                int entreeChoice = userChoice();
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
                makeTaco newBasicTaco = new makeTaco();
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
