package com.teksystems.bootcamp;


import java.io.PrintStream;

public class TekTacos implements IPrint {

    public static void main(String[] args) {

        Taco basicTaco = new BasicTaco();
        Taco deluxeTaco = new DeluxeTaco();
        Taco veggieTaco = new VeggieTaco();

        basicTaco.addTopping("onion");
        basicTaco.addTopping("tomato");

        Order newOrder = new Order(basicTaco);

        System.out.println(newOrder.tacoProtein);




    }


}
