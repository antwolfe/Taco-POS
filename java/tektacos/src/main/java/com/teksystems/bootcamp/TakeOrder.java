package com.teksystems.bootcamp;

import java.util.Scanner;

public interface TakeOrder {
    // user input handling

    default int getUserInput() { //VALIDATION
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a number: ");
        return scanner.nextInt();
    }

    default Order fromMainMenu(Order theOrder) {
        boolean completedOrder = false;
        while (!completedOrder) {
            Menu.mainMenu();
            int choice = getUserInput();

            switch (choice) {
                case 1:
                    theOrder.fromEntreeMenu(theOrder);
                    System.out.println("done with entree");
                    break;
                case 2:
                    theOrder.fromSideMenu(theOrder);
                    System.out.println("done with side");
                    break;
                case 3:
                    theOrder.fromDrinksMenu(theOrder);
                    System.out.println("done with drink");
                    break;
                case 4:
                    System.out.println("Start combo menu");
                case 5:
                    System.exit(1);
            }

            boolean isValidInput = false;
            while (!isValidInput) {
                System.out.print("Would you like to add something else? (y or n) --> ");
                Scanner scIn = new Scanner(System.in);
                String response = scIn.nextLine();
                if (response.equalsIgnoreCase("n")) {
                    isValidInput = true;
                    completedOrder = true;
                } else if (response.equalsIgnoreCase("y")) {
                    System.out.println(("Yes, add some more!"));
                    isValidInput = true;
                } else {
                    System.out.println("Please enter in 'y' or 'n'");
                }
            }

        }
        return theOrder;
    }

    default void fromEntreeMenu(Order theOrder) {
        Menu.entreeMenu();
        Taco chosenTaco = null;
        switch (theOrder.getUserInput()) {
            case 1:
                chosenTaco = new BasicTaco();
                break;
            case 2:
                chosenTaco = new DeluxeTaco();
                break;
            case 3:
                chosenTaco = new VeggieTaco();
                break;
            default: //checkout with defaults?
                System.exit(1);
        }

        theOrder.fromTortillaMenu(theOrder, chosenTaco);
    }

    // refactor: if choice NOT last choice ((default)) SET_? ELSE, DO NOTHING/SET CHOICE TO DEFAULT
    // VALIDATION

    default void fromTortillaMenu(Order theOrder, Taco theTaco) {
        Menu.tortillaMenu();
        int choice = theOrder.getUserInput();
        if (choice != 2 && (!theTaco.getTortilla().equals(Tortillas.CORN))) {
            theTaco.setTortilla(Tortillas.FLOUR);
        } else {
            theTaco.setTortilla(Tortillas.CORN);
        }
        theOrder.fromProteinMenu(theOrder, theTaco);
    }

    default void fromProteinMenu(Order theOrder, Taco theTaco) {
        Menu.proteinMenu();
        int choice = theOrder.getUserInput();
        Proteins[] proteins = Proteins.values();
        for (Proteins protein : proteins) {
            if (proteins[choice - 1] == protein) {
                theTaco.setProtein(proteins[choice - 1]);
            }
        }
        theOrder.fromToppingMenu(theOrder, theTaco);
    }

    default void fromToppingMenu(Order theOrder, Taco theTaco) {
        Toppings[] toppings = Toppings.values();
        while (theTaco.getToppingList().size() < theTaco.toppingLimit) {
            Menu.toppingMenu();
            int choice = theOrder.getUserInput();
            for (Toppings topping : toppings) {
                if (toppings[choice - 1] == topping) {
                    theTaco.addTopping(toppings[choice - 1]);
                }
            }
        }
        theOrder.addItemToOrder(theTaco);
    }

    default void fromSideMenu(Order theOrder) {
        Menu.sideMenu();
        int choice = theOrder.getUserInput();
        Sides[] sides = Sides.values();
        for (Sides side : sides) {
            if (sides[choice - 1] == side) {
                theOrder.addItemToOrder(sides[choice - 1]);
            }
        }
    }

    default void fromDrinksMenu(Order theOrder) {
        Menu.drinkMenu();
        int choice = theOrder.getUserInput();
        Drinks[] drinks = Drinks.values();
        for (Drinks drink : drinks) {
            if (drinks[choice - 1] == drink) {
                theOrder.addItemToOrder(drinks[choice - 1]);
            }
        }
    }

}
