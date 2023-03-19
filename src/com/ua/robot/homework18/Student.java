package com.ua.robot.homework18;
import java.util.List;

public class Student <T> {
private T[] arrayStudents;

public Student() {
}

public Student(T[] arrayStudents) {
        this.arrayStudents = arrayStudents;
    }
    public T[] getArrayStudents() {
        return arrayStudents;
    }

    public void setArrayStudents(T[] arrayStudents) {

    this.arrayStudents = arrayStudents;
    }

    public void printArrayStudents() {
        System.out.print("\nLast name our students (implementation via an Array):");
        for (T o: arrayStudents    ) {
            System.out.print(" " + o);
        }
    }
}
