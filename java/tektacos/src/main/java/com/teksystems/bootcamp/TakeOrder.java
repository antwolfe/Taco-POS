package com.teksystems.bootcamp;

import java.util.Scanner;

public interface TakeOrder {
    // user input handling

    default int getUserInput(int max_num) { //VALIDATION
        boolean isValidInput = false;
        int response = 0;
        while (!isValidInput) {
            System.out.print("Choose a number: ");
            Scanner scanner = new Scanner(System.in);
            response =  scanner.nextInt();
            if (response <= max_num) {
                isValidInput = true;
            } else {
                System.out.println("Incorrect response, please try again.");
            }
        }
        return response;
    }

    default Order fromMainMenu(Order theOrder) {
        boolean completedOrder = false;
        while (!completedOrder) {
            Menu.mainMenu();
            int choice = getUserInput(5);

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
        switch (theOrder.getUserInput(4)) {
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
        int choice = theOrder.getUserInput(Tortillas.values().length + 1);
        if (choice != 2 && (!theTaco.getTortilla().equals(Tortillas.CORN))) {
            theTaco.setTortilla(Tortillas.FLOUR);
            System.out.println("You chose the flour tortilla");
        } else {
            theTaco.setTortilla(Tortillas.CORN);
            System.out.println("You chose the corn tortilla");
        }
        theOrder.fromProteinMenu(theOrder, theTaco);
    }

    default void fromProteinMenu(Order theOrder, Taco theTaco) {
        Menu.proteinMenu();
        Proteins[] proteins = Proteins.values();
        int choice = theOrder.getUserInput(proteins.length);
        for (Proteins protein : proteins) {
            if (proteins[choice - 1] == protein) {
                theTaco.setProtein(proteins[choice - 1]);
                System.out.println("You added " + proteins[choice - 1].getDisplayName());
            }
        }
        theOrder.fromToppingMenu(theOrder, theTaco);
    }

    default void fromToppingMenu(Order theOrder, Taco theTaco) {
        Toppings[] toppings = Toppings.values();
        while (theTaco.getToppingList().size() < theTaco.toppingLimit) {
            Menu.toppingMenu();
            int choice = theOrder.getUserInput(toppings.length);
            for (Toppings topping : toppings) {
                if (toppings[choice - 1] == topping) {
                    theTaco.addTopping(toppings[choice - 1]);
                    System.out.println("You added " + toppings[choice - 1].getDisplayName());
                }
            }
        }
        theOrder.addItemToOrder(theTaco);
    }

    default void fromSideMenu(Order theOrder) {
        Menu.sideMenu();
        Sides[] sides = Sides.values();
        int choice = theOrder.getUserInput(sides.length);
        for (Sides side : sides) {
            if (sides[choice - 1] == side) {
                theOrder.addItemToOrder(sides[choice - 1]);
                System.out.println("You added " + sides[choice - 1].getDisplayName());
            }
        }
    }

    default void fromDrinksMenu(Order theOrder) {
        Menu.drinkMenu();
        Drinks[] drinks = Drinks.values();
        int choice = theOrder.getUserInput(drinks.length);
        for (Drinks drink : drinks) {
            if (drinks[choice - 1] == drink) {
                theOrder.addItemToOrder(drinks[choice - 1]);
                System.out.println("You added " + drinks[choice - 1].getDisplayName());
            }
        }
    }

}
