package com.ua.robot.homework22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 75.5f));
        students.add(new Student("Mary", 69.9f));
        students.add(new Student("Vlad", 80.9f));
        students.add(new Student("Alex", 96.5f));
        System.out.println( "Original order: \n" + students);
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Sorted order by name: \n" + students);
        Collections.sort(students, Comparator.comparing(Student::getAverageGrade) .reversed());
//        Collections.sort(students, (o1, o2) -> o1.getName().compareTo(o2.getName());
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                    return o1.getName().compareTo(o2.getName());
//            }
//        });
        System.out.println("Sorted order by average grade from more ro less: \n" + students);
    }
}
