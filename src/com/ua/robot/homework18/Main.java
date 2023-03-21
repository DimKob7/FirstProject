package com.ua.robot.homework18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("First list : " +list);
        List<Double> doubles = new LinkedList<>();
        for (int i = 0; i < 20000000; i++) {
            double value = Math.random();
            doubles.add(value);
        }
        System.out.println("Size of second list: "+doubles.size());
        String[] array = {"Petrenko","Ivanko","Kovtunenko"};
        Student<String> student = new Student<>(array);
        student.printArrayStudents();
        Students<String> students = new Students<>(Arrays.asList(array));
        students.printStudent();
    }
}
