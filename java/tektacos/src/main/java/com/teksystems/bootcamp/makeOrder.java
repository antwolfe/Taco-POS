package com.teksystems.bootcamp;

import java.util.Scanner;

public class makeOrder {


    public static int setUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Choice: ");
        return scanner.nextInt();
    }

    public void makeBasicTaco() {
        System.out.println("Making Basic Taco");
    }

    public void makeDeluxeTaco() {
    }

    public void makeVeggieTaco() {
    }


    public static String createTaco(int tacoType) {
        switch (tacoType) {
            case 1:
                return "basic";
            case 2:
                return "deluxe";
            case 3:
                return "veggie";
            default:
                return "basic taco meal";
        }
    }


}
