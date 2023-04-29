package com.ua.robot.homework32;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Starting "+Thread.currentThread().getName());
        for (int i = 0; i < 11; i++) {
            System.out.println(Thread.currentThread().getName()+" : number is "+i);
        }
        System.out.println("Ended "+Thread.currentThread().getName());
    }

}
