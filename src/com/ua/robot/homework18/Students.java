package com.ua.robot.homework18;

import java.util.ArrayList;
import java.util.List;

public class Students <E> extends ArrayList<E> {
    private List <E> list = new ArrayList<>();

    public Students() {
    }

    public Students(List<E> list) {
        this.list = list;
    }

    public void setStudent(E student) {
        this.add(student);
    }
    public void printStudent() {
        System.out.print("\nLast name our students (implementation via an ArrayList):");
        for (E o: list    ) {
            System.out.print(" "+o);
        }
    }


}
