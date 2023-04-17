package com.ua.robot.homework25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean marker = false;
        int number = 0;
        while (!marker) {
            System.out.println("Write some number: ");
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextInt();
                marker = true;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input! Stay calm and carry on!");
            }
        }
        System.out.println("Well done! Your number is " + number);
    }
}

