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
            System.out.println(i + ". " + tortillas[i-1].getDisplayName());
        }
        System.out.println("===============");

    }

    public void proteinMenu() {
        Protein[] proteins = Protein.values();
        System.out.println(" ----PROTEINS---- ");
        System.out.println("===============");
        for (int i = 1; i <= proteins.length; i++){
            System.out.println(i + ". " + proteins[i-1].getDisplayName());
        }
        System.out.println("===============");
    }

    public void toppingMenu() {
        Topping[] toppings = Topping.values();
        System.out.println(" ----TOPPINGS---- ");
        System.out.println("=================");
        for (int i = 1; i <= toppings.length; i++){
            System.out.println(i + ". " + toppings[i-1].getDisplayName());
        }
        System.out.println("=================");

    }


}
