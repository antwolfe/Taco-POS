package com.teksystems.bootcamp;

import java.util.Scanner;

public interface TakeOrder {
    // user input handling

    default int getUserInput(int max_num) {
        boolean isValidInput = false;
        int response = 0;
        while (!isValidInput) {
            System.out.print("Choose a number: ");
            Scanner scanner = new Scanner(System.in);
            response = scanner.nextInt();
            if (response <= max_num) {
                isValidInput = true;
            } else {
                System.out.println("Incorrect response, please try again.");
            }
        }
        return response;
    }

    // main menu logic
    default Order fromMainMenu(Order theOrder) {
        boolean completedOrder = false;
        while (!completedOrder) {
            Menu.mainMenu();
            int choice = getUserInput(5);

            switch (choice) {
                case 1:
                    theOrder.addItemToOrder(fromEntreeMenu(theOrder));
                    break;
                case 2:
                    theOrder.addItemToOrder(fromSideMenu(theOrder));
                    break;
                case 3:
                    theOrder.addItemToOrder(fromDrinksMenu(theOrder));
                    break;
                case 4:
//                    theOrder.addItemToOrder(fromComboMenu(theOrder));
                    break;
                case 5:
                    System.exit(1);
            }

            boolean isValidInput = false;
            while (!isValidInput) {
                System.out.println();
                System.out.println("---------------------------------------------------");
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

    // all options on main menu

    default Taco fromEntreeMenu(Order theOrder) {
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
                System.exit(1); //VALIDATION
        }

        chosenTaco.setTortilla(fromTortillaMenu(theOrder, chosenTaco));
        chosenTaco.setProtein(fromProteinMenu(theOrder, chosenTaco));
        chosenTaco = fromToppingMenu(theOrder, chosenTaco);
        return chosenTaco;
    }

    // refactor: if choice NOT last choice ((default)) SET_? ELSE, DO NOTHING/SET CHOICE TO DEFAULT
    // VALIDATION

    default Tortillas fromTortillaMenu(Order theOrder, Taco theTaco) {
        Menu.tortillaMenu();
        int choice = theOrder.getUserInput(Tortillas.values().length + 1);
        if (choice != 2 && (!theTaco.getTortilla().equals(Tortillas.CORN))) {
            System.out.println("You chose the flour tortilla");
            return Tortillas.FLOUR;
        } else {
            System.out.println("You chose the corn tortilla");
            return Tortillas.CORN;
        }
    }

    default Proteins fromProteinMenu(Order theOrder, Taco theTaco) {
        if (theTaco.getProtein() == Proteins.BLACKBEANS) {
            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println("Veggie taco comes with black beans");
            System.out.println("--------------------------------------");
            return Proteins.BLACKBEANS;
        } else {
            Menu.proteinMenu();
            Proteins[] proteins = Proteins.values();
            int choice = theOrder.getUserInput(proteins.length + 1);
            if (choice == 6) {
                System.out.println("You chose " + theTaco.getProtein().toString());
                return theTaco.getProtein();
            } else {
                System.out.println("You added " + proteins[choice - 1].toString());
                return proteins[choice - 1];
            }
        }
    }

    default Taco fromToppingMenu(Order theOrder, Taco theTaco) {
        Toppings[] toppings = Toppings.values();
        while (theTaco.getToppingList().size() < theTaco.toppingLimit) {
            Menu.toppingMenu();
            int choice = theOrder.getUserInput(toppings.length);
            for (Toppings topping : toppings) {
                if (toppings[choice - 1] == topping) {
                    theTaco.addTopping(toppings[choice - 1]);
                    System.out.println("You added " + toppings[choice - 1].toString());
                }
            }
        }
        return theTaco;
    }

    default Sides fromSideMenu(Order theOrder) {
        Menu.sideMenu();
        Sides[] sides = Sides.values();
        int choice = theOrder.getUserInput(sides.length);
        if (choice <= sides.length) {
            System.out.println("You added " + sides[choice - 1].toString());
            return sides[choice - 1];
        } else {
            System.out.println("YOU SHALL NOT PASS");
            return fromSideMenu(theOrder);
        }
    }

    default Drinks fromDrinksMenu(Order theOrder) {
        Menu.drinkMenu();
        Drinks[] drinks = Drinks.values();
        int choice = theOrder.getUserInput(drinks.length);
        if (choice <= drinks.length) {
            System.out.println("You added " + drinks[choice - 1].toString());
            return drinks[choice - 1];
        } else {
            System.out.println("NUUUUUU");
            return fromDrinksMenu(theOrder);
        }
    }

    default Combo fromComboMenu(Order theOrder) {
        System.out.println("Pick an entree, side and drink");
        Taco newTaco = fromEntreeMenu(theOrder);
        Sides newSide = fromSideMenu(theOrder);
        Drinks newDrink = fromDrinksMenu(theOrder);
        return new Combo( newTaco, newSide, newDrink);
    }

}
