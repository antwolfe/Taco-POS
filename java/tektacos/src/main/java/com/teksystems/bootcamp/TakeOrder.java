package com.teksystems.bootcamp;


import java.util.ArrayList;
import java.util.Scanner;

public abstract class TakeOrder extends Order {

    // user input handling

    Order currentOrder = new Order();


    @Override
    public void addItemToOrder(MenuItem item) {
        super.addItemToOrder(item);
    }

    @Override
    public void print() {
        super.print();
    }

    int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a number: ");
        return scanner.nextInt();
    }

    public void fromMainMenu() {
        int choice = getUserInput();
        switch (choice) {
            case 1:
                new Menu().entreeMenu();
                break;
            case 2:
                System.out.println("new menu, side menu");
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

    public void fromEntreeMenu() {

        int choice = getUserInput();
        switch (choice) {
            case 1:
                BasicTaco basicTaco = new BasicTaco();
                currentOrder.addItemToOrder(basicTaco);
                currentOrder.print();
                new Menu().tortillaMenu();
                break;
            case 2:
                Order newDeluxeOrder = new Order();
                DeluxeTaco deluxeTaco = new DeluxeTaco();
                newDeluxeOrder.addItemToOrder(deluxeTaco);
                new Menu().tortillaMenu();
                break;
            case 3:
                Order newVeggieOrder = new Order();
                VeggieTaco veggieTaco = new VeggieTaco();
                newVeggieOrder.addItemToOrder(veggieTaco);
                new Menu().tortillaMenu();
                break;
            case 4: //checkout with defaults?
                System.exit(1);
        }


    }

    public void fromTortillaMenu() {
        int choice = getUserInput();
        switch (choice) {
            case 1:
                currentOrder.print();
                break;
            case 2:
            case 3:
                new Menu().tortillaMenu();
                break;
            case 4:
                System.exit(1);
        }
    }


}
