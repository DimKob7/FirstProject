package com.ua.robot.homework19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int COUNT = 1000;
        Set<Integer> hs = new HashSet<>();
        Set<Integer> lhs = new LinkedHashSet<>();
        Set<Integer> ts = new TreeSet<>();
        Number number = new Number();
        for (int i = 1; i < COUNT; i++) {
            if (i < 333) {
                hs.add(number.generateRandomNumber());
            } else if (i < 667) {
                lhs.add(number.generateRandomNumber());
            } else {
                ts.add(number.generateRandomNumber());
            }
        }
        System.out.println("HashSet: " + hs.size());
        hs.forEach(s -> {
            System.out.print(s + " ");
        });
        System.out.println("\nLinkedHashSet: " + lhs.size());
        lhs.forEach(s -> {
            System.out.print(s + " ");
        });
        System.out.println("\nTreeSet: " + ts.size());
        ts.forEach(s -> {
            System.out.print(s + " ");
        });

    }
}
