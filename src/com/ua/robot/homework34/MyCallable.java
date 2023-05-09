package com.ua.robot.homework34;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    public MyCallable() {
    }

    @Override
    public String call() throws Exception {
        int result = new Random().nextInt(1,101);
        return ("Number : "+ result+"  Used next thread: "+Thread.currentThread().getName()+" !");
    }
}
