package com.ua.robot.homework7;
import java.util.Scanner;

public class Main {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        int number = 3;
        System.out.println("\nThe third power of 3 is : " + ANSI_GREEN + thirdPowerOfNumber(number) + ANSI_RESET + "\n");
        System.out.println("How many stars should be printed? : ");
        Scanner console = new Scanner(System.in);
        printChar(console.nextInt());
        System.out.println("\nWhat symbol do you want to print (Оnly one char. The rest will be ignored.) ?");
        String symbol = console.next();
        System.out.println("How many times?");
        printChar(console.nextInt(), symbol);
    }

    static int thirdPowerOfNumber(int k) {
        int total = 1;
        for (int i = 3; i >= 1; i--) {
            total *= k;
        }
        return (total);
    }

    static void printChar(int l) {
        if (l != 0) {
            for (int i = 0; i < l; i++) {
                System.out.print("*");
            }
        }
    }

    static void printChar(int k, String s) {

        if (k != 0) {
            char symbol = s.charAt(0);
            for (int i = 0; i < k; i++) {
                System.out.print(symbol);
            }
        }
    }
}
