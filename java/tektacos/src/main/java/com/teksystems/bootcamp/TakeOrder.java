package com.teksystems.bootcamp;


public abstract class TakeOrder {



    public void fromMainMenu() {
    int choice = IPrint.getUserInput();
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
        int choice = IPrint.getUserInput();
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
