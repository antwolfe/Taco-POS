package com.teksystems.bootcamp.mysterygame;


import java.util.Scanner;


public class MysteryGame
{

    public static void main( String[] args )
    {
    Scanner scanner = new Scanner(System.in);
    String input;
        do {
            System.out.print("> ");
            input = scanner.nextLine();
            System.out.println("You entered '" + input + "'");
        } while (!"q".equals(input));
    }
}
