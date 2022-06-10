package com.teksystems.bootcamp;

public class App 
{
    public static void displayWelcome() {
        System.out.println();
        System.out.println("WELCOME TO TEKTACOS");
        System.out.println("please choose a number below");
        System.out.println();
    }

    public static void main( String[] args )

    {
        displayWelcome();
        Menu menu = new Menu();
        int choice = menu.takeOrder();
        System.out.println(choice);

    }



}
