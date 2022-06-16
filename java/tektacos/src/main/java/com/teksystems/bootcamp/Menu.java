package com.teksystems.bootcamp;

public class Menu {

    public void mainMenu() {

        System.out.println("-------------------");
        System.out.println(" ----MAIN MENU---- ");
        System.out.println("===================");
        System.out.println("    1. Entree");
//        System.out.println("  2. Side");
//        System.out.println("  3. Drink");
//        System.out.println("  4. Combo");
        System.out.println("===================");
    }

    public void entreeMenu() {
        System.out.println(" ----ENTREES---- ");
        System.out.println("===============");
        System.out.println("1. Basic Taco");
//        System.out.println("2. Deluxe Taco");
//        System.out.println("3. Veggie Taco");
        System.out.println("===============");
    }

    public void tortillaMenu() {
        Tortilla[] tortillas = Tortilla.values();
        System.out.println(" ----TORTILLAS---- ");
        System.out.println("===============");
        for (int i = 1; i <= tortillas.length; i++){
            System.out.println(i + ". " + tortillas[i-1]);
        }
        System.out.println("===============");

    }

    public static void proteinMenu() {
        System.out.println(" ----PROTEIN---- ");
        System.out.println("===============");
        System.out.println("1. Ground beef");
//        System.out.println("2. Steak");
//        System.out.println("3. Chicken");
//        System.out.println("3. Shredded Pork");
//        System.out.println("3. Black Beans");
        System.out.println("===============");
    }



}
