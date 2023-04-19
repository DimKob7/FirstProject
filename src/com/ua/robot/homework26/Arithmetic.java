package com.ua.robot.homework26;

public class Arithmetic {
    private int number;

    public Arithmetic() {
    }

    public Arithmetic(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void negativeNumber(int number) throws NegativeNumber {
        if (number < 0) {
            throw new NegativeNumber("\nNegative number exception!");
        }
    }

    public int square(int number) {
        return number * number;
    }
}