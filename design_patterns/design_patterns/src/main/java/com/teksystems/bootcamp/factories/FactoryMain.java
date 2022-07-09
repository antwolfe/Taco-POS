package com.teksystems.bootcamp.factories;

import java.util.HashMap;
import java.util.Map;

public class FactoryMain

{

    public static void main( String[] args )
    {

        HashMap<String, String> naughtyNiceList = new HashMap<>();

        naughtyNiceList.put("Jaden", "naughty");
        naughtyNiceList.put("Jaime", "nice");
        naughtyNiceList.put("Jake", "nice");
        naughtyNiceList.put("Jeffery", "naughty");
        naughtyNiceList.put("Jolie", "naughty");


        SantasFactory factory = new SantasFactory();


        for (Map.Entry<String, String> set : naughtyNiceList.entrySet()) {
            System.out.println(set.getKey() + factory.makeGift(set.getValue()).getGift());
        }


    }
}
