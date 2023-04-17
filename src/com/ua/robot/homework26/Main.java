package com.ua.robot.homework26;

public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int c = 0;
        int d = -1;
        Arithmetic arithmetic = new Arithmetic();
        try {
            arithmetic.negativeNumber(arithmetic.square(a));
        } catch (NegativeNumber e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Number " + a + ". Square a equal " + arithmetic.square(a) + ".");
        try {
            c = a / b;
            System.out.println("Division equals "+c);
        } catch (ArithmeticException e) {
            System.out.println("\nError => "+e.getMessage());
            System.out.println("Division is not correct!");
        }
    }
}
