package com.ua.robot.homework5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (only integer) : ");
        int firstnumber = scanner.nextInt();
        System.out.print("Enter second number (only integer) : ");
        int secondnumber = scanner.nextInt();
        System.out.println("Compare your numbers:");
        String description1 = "1. Which number is greater? ";
        String description2 = "2. Which number is less? ";

        if ( firstnumber > secondnumber){
            System.out.println(description1+" The first number "+firstnumber+" is greater.");
            System.out.println(description2+" The second number "+secondnumber+" is less.");
        }
        else if (firstnumber == secondnumber){
            System.out.println(description1+" Both numbers are equal "+firstnumber+".");
            System.out.println(description2+" Both numbers are equal "+firstnumber+".");
        }
        else {
            System.out.println(description1 + " The second number " + secondnumber + " is greater.");
            System.out.println(description1 + " The first number " + firstnumber + " is less.");
        }
        System.out.println("3. Even or odd number?  ");
        if (firstnumber %2 == 0){
            System.out.println("3.1 The first number is even. ");
        } else {
            System.out.println("3.1 The first number is odd. ");
        }
        if (secondnumber %2 == 0){
            System.out.println("3.2 The second number is even. ");
        } else {
            System.out.println("3.2 The second number is odd. ");
        }
    }
}
