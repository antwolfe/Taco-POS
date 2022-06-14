package com.teksystems.bootcamp;

import java.util.Scanner;

public class Protein {

    int proteinType;

    public void setProtein() {
        System.out.println("Please choose protein type: ");
        Print.proteinMenu();
        Scanner scanner = new Scanner(System.in);
        this.proteinType = scanner.nextInt();
    }

    public void displayChosenProtein(int type) {
        switch (type) {
            case 1:
                System.out.println("You've chosen a ground beef taco");
                break;
            case 2:
                System.out.println("You've chosen a steak taco");
                break;
            default:
                System.out.println("You've chosen the default protein for your taco");
                break;

        }
    }
}
