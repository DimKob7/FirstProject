package com.ua.robot.homework6;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.println("Fibonacci numbers up to hundreds: ");
        System.out.print(a + " " + b + " ");
        for (int i = b; i < 100; i = c) {
            c = a + b;
            if (c > 100) {
                break;
            }
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        int total = 1;
        for (int i = 1; i <= 7; i++) {
            total *= i;
        }
        System.out.println("\nFactorial of 7:\n" + total);
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nThe even numbers between 1 and 100:");
        for (int i = 2; i < 101; i+=2) {
            System.out.print(i + " ");
        }
    }
}
