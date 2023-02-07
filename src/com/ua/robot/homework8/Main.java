package com.ua.robot.homework8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int length2d= 4;
        int maxValue = 10;
        int[] newArray = new int[length];
        int[][] new2dArray = new int[length2d][length2d];
        createNewArrWithRandomNumber(newArray, maxValue);
        System.out.println("1-2. Create and print a new array of length 10 with random numbers:");
        printArray(newArray);
        System.out.println("3. Find and print a min number in array:");
        printMinNumberInArray(newArray);
        System.out.println("4. Find and print a max number in array:");
        printMaxNumberInArray(newArray);
        System.out.println("5. Find and print an average number in array:");
        printAverageNumberInArray(newArray);
        System.out.println("6. Find and print a total of numbers in array:");
        printTotalNumberInArray(newArray);
        createNew2dArrWithRandomNumber(new2dArray, maxValue);
        System.out.println("7-8. Additional.Create and print a new 2D array of length 4 on 4 with random numbers:");
        print2dArray(new2dArray);
        System.out.println("9. Additional. Find and print a total of numbers in main diagonal:");
        printTotalOfMainDiagonal(new2dArray);
        System.out.println("10.Additional. Find and print a total of numbers in secondary diagonal:");
        printTotalOfSecondaryDiagonal(new2dArray);
    }

    static void printArray(int[] newArray) {
        for (int k : newArray) {
            System.out.print(k + " ");
        }
        System.out.println(" ");
    }

    static void printMinNumberInArray(int[] newArray) {
        int minNumber = newArray[0];
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] < minNumber) {
                minNumber = newArray[i];
            }
        }
        System.out.println(minNumber);
    }

    static void printMaxNumberInArray(int[] newArray) {
        int maxNumber = newArray[0];
        for (int j : newArray) {
            if (j > maxNumber) {
                maxNumber = j;
            }
        }
        System.out.println(maxNumber);
    }

    static void printAverageNumberInArray(int[] newArray) {
        float averageNumber = 0f;
        for (int j : newArray) {
            averageNumber += j;
        }
        averageNumber /= newArray.length;
        System.out.println(averageNumber);
    }

    static void printTotalNumberInArray(int[] newArray) {
        int totalNumber = 0;
        for (int j : newArray) {
            totalNumber += j;
        }
        System.out.println(totalNumber);
    }

    static void createNewArrWithRandomNumber(int[] newArray, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(maxValue);
        }
    }

    static void createNew2dArrWithRandomNumber(int[][] new2dArray, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < new2dArray.length; i++) {
            for (int j = 0; j < new2dArray[i].length; j++) {
                new2dArray[i][j] = random.nextInt(maxValue);
            }
        }

    }

    static void print2dArray(int[][] new2dArray) {
        for (int[] i : new2dArray) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    static void printTotalOfMainDiagonal(int[][] new2dArray) {
        int total = 0;
        for (int i = 0; i < new2dArray.length; i++) {
                for (int j = 0; j < new2dArray[i].length; j++) {
                if (i==j) {
                   total += new2dArray[i][j];
                }
            }
        }
        System.out.println(total);
    }
    static void printTotalOfSecondaryDiagonal(int[][] new2dArray) {
        int total = 0;
        for (int i = 0; i < new2dArray.length; i++) {
            for (int j = 0; j < new2dArray[i].length; j++) {
                if (i+j == new2dArray.length-1) {
                    total += new2dArray[i][j];
                }
            }
        }
        System.out.println(total);
    }
}
