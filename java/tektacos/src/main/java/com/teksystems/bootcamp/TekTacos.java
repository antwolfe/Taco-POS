package com.teksystems.bootcamp;



public class TekTacos implements IPrint {

    public static void main(String[] args) {

        new Menu().mainMenu();
//        int choice = IPrint.getUserInput();
        BasicTaco basicTaco = new BasicTaco();
        System.out.println(basicTaco.getToppingList());
        basicTaco.addTopping(Topping.SHREDDEDLETTUCE);

        basicTaco.addTopping(Topping.ONION);
        basicTaco.addTopping(Topping.CHEESE);
        basicTaco.addTopping(Topping.JALEPENO);
        System.out.println(basicTaco.getToppingList());
        basicTaco.addTopping(Topping.SALSA);
        System.out.println(basicTaco.getToppingList());


        DeluxeTaco deluxe = new DeluxeTaco();
        System.out.println(deluxe.getToppingList());






    }


}
