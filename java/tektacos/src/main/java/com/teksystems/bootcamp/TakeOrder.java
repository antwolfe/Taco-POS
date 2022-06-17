package com.teksystems.bootcamp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class TakeOrder extends Order {
    // user input handling

//    ArrayList<MenuItem> itemsInOrder;
//    public TakeOrder() {
//        this.itemsInOrder = new ArrayList<>();
//    }

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
                Order newOrder = new Order();
                BasicTaco basicTaco = new BasicTaco();
                newOrder.addItemToOrder(basicTaco);
                new Menu().tortillaMenu();
                newOrder.print();
                break;
            case 2:
            case 3:
                break;
            case 4:
                System.exit(1);
        }
    }

    public void fromTortillaMenu() {
        int choice = getUserInput();
        switch (choice) {
            case 1:
            case 2:
            case 3:
                new Menu().tortillaMenu();
                break;
            case 4:
                System.exit(1);
        }
    }


}
