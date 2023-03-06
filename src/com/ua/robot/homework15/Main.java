package com.ua.robot.homework15;

public class Main {
    public static void main(String[] args) {
        Drivable d1 = new Driver();
        Flyable f1 = new Pilot();
        d1.drive();
        f1.fly();
    }
}
