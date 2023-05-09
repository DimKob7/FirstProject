package com.ua.robot.homework34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Callable<String> callable = new MyCallable();
        for (int i = 0; i < 100; i++) {
            Future<String> future = executorService.submit(callable);
            list.add(future);
        }
        list.stream().forEach(future -> {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
//        for(Future<String> future : list){
//            try {
//                System.out.println(" "+future.get());
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
        executorService.shutdown();
    }
}
