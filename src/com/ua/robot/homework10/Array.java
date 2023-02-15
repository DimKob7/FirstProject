package com.ua.robot.homework10;

import java.util.Arrays;
import java.util.Random;

public class Array {
    private int[] newArray;
    private int maxRandomValue;
    protected int temp;

    public Array(int[] newArray, int maxRandomValue) {
        this.newArray = newArray;
        this.maxRandomValue = maxRandomValue;
    }

    public void printArray() {
        System.out.println();
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }

    public void sortArrayFromMinToMax() {
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] > newArray[j]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
    }

    public void sortArrayFromMaxToMin() {
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] < newArray[j]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
    }

    public void createNewArrWithRandomNumber() {
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(maxRandomValue);
        }
    }

    public int[] getNewArray() {
        return newArray;
    }

    public void setNewArray(int[] newArray) {
        this.newArray = newArray;
    }

    public int getMaxRandomValue() {
        return maxRandomValue;
    }

    public void setMaxRandomValue(int maxRandomValue) {
        this.maxRandomValue = maxRandomValue;
    }

    @Override
    public String toString() {
        return "Array{" +
                "newArray=" + Arrays.toString(newArray) +
                ", maxRandomValue=" + maxRandomValue +
                ", temp=" + temp +
                '}';
    }
}

