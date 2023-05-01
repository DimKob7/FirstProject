package com.ua.robot.homework32;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadRunnable thread = new ThreadRunnable();
        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);
        t1.start();
//Thread.sleep(1000);
        t2.start();
        System.out.println(Thread.activeCount());

    }
}