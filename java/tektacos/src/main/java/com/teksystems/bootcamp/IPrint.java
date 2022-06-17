package com.teksystems.bootcamp;

import java.util.Scanner;

public interface IPrint {


    static void displayWelcome() {
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("     WELCOME TO TEKTACOS");
        System.out.println("------------------------------");
        System.out.println("what would you like to order?");
    }

    static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a number: ");
        return scanner.nextInt();
    }
}
