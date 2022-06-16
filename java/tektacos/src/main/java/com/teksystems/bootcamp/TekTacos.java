package com.teksystems.bootcamp;



public class TekTacos implements IPrint {

    public static void main(String[] args) {

        Taco basicTaco = new DeluxeTaco();

        Drink newDrink = new Drink("tea");

        Menu menu = new Menu();

        Order newOrder = new Order();

        newOrder.addItemToOrder((MenuItem) basicTaco);
        newOrder.addItemToOrder(newDrink);

        newOrder.print();







    }


}
