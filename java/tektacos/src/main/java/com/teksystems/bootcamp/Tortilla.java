package com.teksystems.bootcamp;
import java.util.Scanner;

public class Tortilla {
    int tortillaType;

    public static void getTortillaMenu() {
        System.out.println(" ----TORTILLAS---- ");
        System.out.println("===============");
        System.out.println("1. Flour");
        System.out.println("2. Corn");
        System.out.println("3. Default");
    }

    public void setTortillaType() {
        Scanner scanner = new Scanner(System.in);
        this.tortillaType = scanner.nextInt();
    }


    public int getTortillaType() {
        return tortillaType;
    }

    public int chooseTortilla() {
        System.out.println("Please choose tortilla type: ");
        Tortilla tortilla = new Tortilla();
        tortilla.getTortillaMenu();
        tortilla.setTortillaType();
        return tortilla.getTortillaType();
    }

    public void displayChosenTortilla(int choice) {
        switch(choice) {
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