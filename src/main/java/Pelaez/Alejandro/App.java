/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius. " +
                "\nPress F to convert from Celsius to Fahrenheit." +
                "\nYour choice: ");

        String tempChoice = input.next();
        if (tempChoice.equalsIgnoreCase("c"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            int temp = input.nextInt();
            int convertedTemp = (temp - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + convertedTemp);
        }
        else if (tempChoice.equalsIgnoreCase("f"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int temp = input.nextInt();
            int convertedTemp = (temp * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + convertedTemp);
        }
        else
            System.out.println("Incorrect choice!");
    }
}
