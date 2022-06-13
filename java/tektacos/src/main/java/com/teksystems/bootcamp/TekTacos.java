package com.teksystems.bootcamp;

import java.util.ArrayList;

public class TekTacos implements takeOrder
{

    ArrayList newOrder = new ArrayList();

    public static void displayWelcome() {
        System.out.println();
        System.out.println("WELCOME TO TEKTACOS");
        System.out.println("please choose a number below");
        System.out.println();
    }


    public static void main( String[] args )

    {
        displayWelcome();
        takeOrder.getMenu();
        int userChoice = takeOrder.getUserChoice();
        System.out.println(userChoice);



    }



}
