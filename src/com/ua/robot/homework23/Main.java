package com.ua.robot.homework23;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Integer.min;
import static java.util.stream.Collectors.toMap;

public class Main {
    public static void main(String[] args) {
        List<String> listNames =new  ArrayList<>();
        listNames.add("Jonko");
        listNames.add("Alexeenko");
        listNames.add("Johnov");
        listNames.add("Marienko");
        listNames.add("Vladov");
        listNames.add("Alexev");
        listNames.add("Johnkov");
        listNames.add("Vladov");
        listNames.add("Alexidze");
        listNames.add("Johnkov");
        listNames.add("Vladov");
        listNames.add("Alexeekiv");
        listNames.add("Alexev");
        listNames.add("Johnkov");
        listNames.add("Vladov");
        listNames.add("Alexov");
        listNames.add("Johnkov");
        listNames.add("Vladov");
        listNames.add("Alexeekiv");
        listNames.add("Alexev");

        Map<String, Long> mapNames = listNames.stream()
                .collect(Collectors.groupingBy(it -> it, Collectors.counting()));
        System.out.println(mapNames);

        Random random = new Random();
        var total = IntStream.range(0, 10)
               .map(it -> random.nextInt(1, 100))
                .sum();
        System.out.println("Total: " + total);


//        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 4, 9, 10);
//        System.out.println(list);
//        List<Integer> result = new ArrayList<>();
//        for (Integer integer1: list) {
//            if (integer1 % 2 == 0) {
//                result.add(integer1 *2);
//            }
//        }
//        System.out.println(result);
//        List<Integer> streamResult = list.stream().filter(ii-> ii %2 ==0)
//                .map(ii -> ii*2)
//                .collect(Collectors.toList());
//        System.out.println(streamResult);
//        Set<Integer> setResult = list.stream()
//                .filter( ii -> ii %2 ==0)
//                .map(ii -> ii*2)
//                .collect(Collectors.toSet());
//        System.out.println(setResult);
//        var paged = partition(list, 3);
//        System.out.println(paged);
//
//
//        }
//    static Map<Integer, List<Integer>> partition(List<Integer> list, int pageSize) {
//        return IntStream.iterate(0, i -> i + pageSize)
//                .limit((list.size() + pageSize - 1) / pageSize)
//                .boxed()
//                .collect(toMap(i -> i / pageSize,
//                        i -> list.subList(i, min(i + pageSize, list.size()))));
    }
}
