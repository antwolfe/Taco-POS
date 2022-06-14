package com.teksystems.bootcamp;

import java.util.Scanner;

public class Tortilla {
    int tortillaType;



    public void setTortillaType() {
        System.out.println("Please choose tortilla type: ");
        Print.TortillaMenu();
        Scanner scanner = new Scanner(System.in);
        this.tortillaType = scanner.nextInt();
    }

    public int getTortillaType() {
        return tortillaType;
    }



    public void displayChosenTortilla(int type) {
        switch (type) {
            case 1:
                System.out.println("You've chosen a Flour Tortilla");
                break;
            case 2:
                System.out.println("You've chosen a Corn Tortilla");
                break;
            default:
                System.out.println("You've chosen the default tortilla");
                break;

        }
    }
}