package com.ua.robot.homework33;

import java.util.Random;

public class newThread implements Runnable {
    @Override
    public void run() {
        boolean marker = false;
        while (!marker) {
            Random random = new Random();
            int number = random.nextInt(1, 11);
            System.out.println(number);
            if (number == 5) {
                System.out.println("Congratulation! The number equal to 5!");
                Thread.currentThread().interrupt();
                marker = true;
            }
        }
    }
}
