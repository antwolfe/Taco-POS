package com.teksystems.bootcamp;

public interface Menu {

//    public Menu(Order currentOrder) {
//        super(currentOrder);
//    }

    public static void mainMenu() {
        System.out.println("-------------------");
        System.out.println(" ----MAIN MENU---- ");
        System.out.println("===================");
        System.out.println("    1. Entree");
        System.out.println("    2. Side");
        System.out.println("    3. Drink");
        System.out.println("    4. Combo");
        System.out.println("    5. Exit");
        System.out.println("===================");
    }

    public static void entreeMenu() {
        System.out.println(" ----ENTREES---- ");
        System.out.println("================");
        System.out.println("1. Basic Taco");
        System.out.println("2. Deluxe Taco");
        System.out.println("3. Veggie Taco");
        System.out.println("=================");
    }

    public static void tortillaMenu() {
        Tortillas[] tortillas = Tortillas.values();
        System.out.println("---TORTILLAS---");
        System.out.println("===============");
        for (int i = 1; i <= tortillas.length; i++) {
            System.out.println(i + ". " + tortillas[i - 1].getDisplayName());
        }
        System.out.println("3. default");
        System.out.println("===============");
    }

    public static void proteinMenu() {
        Proteins[] proteins = Proteins.values();
        System.out.println(" ----PROTEINS---- ");
        System.out.println("===============");
        for (int i = 1; i <= proteins.length; i++) {
            System.out.println(i + ". " + proteins[i - 1].getDisplayName());
        }
        System.out.println("===============");
    }

    public static void toppingMenu() {
        Toppings[] toppings = Toppings.values();
        System.out.println(" ----TOPPINGS---- ");
        System.out.println("=================");
        for (int i = 1; i <= toppings.length; i++) {
            System.out.println(i + ". " + toppings[i - 1].getDisplayName());
        }
        System.out.println("=================");
    }

    static void sideMenu() {
        Sides[] sides = Sides.values();
        System.out.println(" ----Sides---- ");
        System.out.println("=================");
        for (int i = 1; i <= sides.length; i++) {
            System.out.println(i + ". " + sides[i - 1].getDisplayName());
        }
        System.out.println("=================");
    }

    static void drinkMenu() {
        Drinks[] drinks = Drinks.values();
        System.out.println(" ----Drinks---- ");
        System.out.println("=================");
        for (int i = 1; i <= drinks.length; i++) {
            System.out.println(i + ". " + drinks[i - 1].getDisplayName());
        }
        System.out.println("=================");
    }
}
