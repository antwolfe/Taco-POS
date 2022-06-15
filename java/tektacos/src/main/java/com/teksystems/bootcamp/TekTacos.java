package com.teksystems.bootcamp;


import java.io.PrintStream;

public class TekTacos implements IPrint {

    public static void main(String[] args) {

//        Menu displayMenu = new Menu();
//        IPrint.displayWelcome();
//        displayMenu.mainMenu();
        Taco newTaco = new VeggieTaco();
        System.out.println(newTaco.getProtein());


    }


}
