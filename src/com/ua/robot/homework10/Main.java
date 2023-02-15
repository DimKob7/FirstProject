package com.ua.robot.homework10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student id1007 = new Student(1007, "John", "Doe", 77, 5);
        id1007.learn();
        id1007.relax();
        id1007.writeDiploma();
        Teacher id777 = new Teacher(777, "James", "Bond", 55, 12);
        id777.vacation();
        id777.work();
        System.out.println("What length do you want to create a new array?");
        System.out.println("Please, enter integer number: ");
        Scanner console = new Scanner(System.in);
        int sizeOfArray = 0;
        if (console.hasNextInt()) {
            sizeOfArray = console.nextInt();
            if (sizeOfArray < 1) {
                System.out.println("Need INTEGER more 0, try next time! Bye!");
                System.exit(0);
            }
        } else {
            System.out.println("Need only INTEGER, try next time! Bye!");
            System.exit(0);
        }
        int[] newArray = new int[sizeOfArray];
        int maxRandomValue = 20;
        Array arrayOne = new Array(newArray, maxRandomValue);
        arrayOne.createNewArrWithRandomNumber();
        System.out.print("Print new array:");
        arrayOne.printArray();
        arrayOne.sortArrayFromMinToMax();
        System.out.print("\nPrint sort array from MIN to MAX:");
        arrayOne.printArray();
        arrayOne.sortArrayFromMaxToMin();
        System.out.print("\nPrint sort array from MAX to MIN");
        arrayOne.printArray();
    }
}
