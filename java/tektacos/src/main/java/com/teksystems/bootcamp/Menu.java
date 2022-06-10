package com.teksystems.bootcamp;

import java.util.Scanner;

public class Menu {

    public static void getMenu() {

        System.out.println(" ----MENU---- ");
        System.out.println("===============");
        System.out.println("1. Entrees");
        System.out.println("2. Sides");
        System.out.println("3. Drinks");
        System.out.println("4. Combo");
        System.out.println("===============");
    }

    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Choice: ");
        return scanner.nextInt();
    }

    public static int takeOrder() {
        getMenu();
        return getUserChoice();
    }
}
