package com.ua.robot.homework17;

public class Main {
    public static void main(String[] args) {
        int days [] = {1,2,3,4,5,6,7};
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        for (int i :days) {
            System.out.print(i+"="+dayOfWeek.getDay(i)+" ");
        }

    }
}
