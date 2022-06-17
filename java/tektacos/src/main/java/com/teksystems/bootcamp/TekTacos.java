package com.teksystems.bootcamp;



public class TekTacos implements IPrint {

    public static void main(String[] args) {

        new Menu().mainMenu();
//        int choice = IPrint.getUserInput();
        BasicTaco basicTaco = new BasicTaco();
        System.out.println(basicTaco.getToppingList());







    }


}
