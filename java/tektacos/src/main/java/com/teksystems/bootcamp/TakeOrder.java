package com.teksystems.bootcamp;

import java.util.Scanner;

public interface TakeOrder {
    // user input handling

    default int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a number: ");
        return scanner.nextInt();
    }

    default void fromMainMenu(Order theOrder, int choice) {
        switch (choice) {
            case 1:
                theOrder.fromEntreeMenu(theOrder);
                System.out.println("done with entree");
                break;
            case 2:
                System.out.println("done with side");
                break;
            case 3:
                System.out.println("new menu drink menu");
                break;
            case 4:
                System.out.println("Start combo menu");
            case 5:
                System.exit(1);
        }
    }

    default void fromEntreeMenu(Order theOrder) {
        Menu.entreeMenu();
        switch (theOrder.getUserInput()) {
            case 1:
                Taco basicTaco = new BasicTaco();
                theOrder.addItemToOrder(basicTaco);
                theOrder.print();
                theOrder.fromTortillaMenu(theOrder, basicTaco);
                break;
            case 2:
                Taco deluxeTaco = new DeluxeTaco();
                theOrder.addItemToOrder(deluxeTaco);
                theOrder.fromTortillaMenu(theOrder, deluxeTaco);
                break;
            case 3:
                Taco veggieTaco = new VeggieTaco();
                theOrder.addItemToOrder(veggieTaco);
                theOrder.fromTortillaMenu(theOrder, veggieTaco);
                break;
            case 4: //checkout with defaults?
                System.exit(1);
        }

    }

    default void fromTortillaMenu(Order theOrder, Taco theTaco) {
        Menu.tortillaMenu();
        int choice = theOrder.getUserInput();
        if (choice != 2) {
            theTaco.setTortilla(Tortillas.FLOUR);
        } else {
            theTaco.setTortilla(Tortillas.CORN);
        }

        theOrder.fromProteinMenu(theOrder, theTaco);
//        switch (theOrder.getUserInput()) {
//            case 1:
////                System.out.println("flour");
//                theTaco.setTortilla(Tortillas.FLOUR);
//                theOrder.print();
//                theOrder.fromProteinMenu(theOrder, theTaco);
//                break;
//            case 2:
////                System.out.println("corn");
//                theTaco.setTortilla(Tortillas.CORN);
//                theOrder.print();
//                theOrder.fromProteinMenu(theOrder, theTaco);
//                break;
//            case 3:
//                System.out.println("default");
//                break;
//            default:
//                System.exit(1);
//        }
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
        theOrder.print();
        fromToppingMenu(theOrder, theTaco);
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
        theOrder.print();
    }


}
