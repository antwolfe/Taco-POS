package com.teksystems.bootcamp.capstone2;


import java.util.Scanner;


public class App 
{

    public static void main( String[] args )
    {
    Scanner scanner = new Scanner(System.in);
    String input;
        do {
            System.out.println("> ");
            input = scanner.nextLine();
            System.out.println("You entered '" + input + "'");
        } while (!"q".equals(input));
    }
}
