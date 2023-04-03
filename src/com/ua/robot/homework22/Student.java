package com.ua.robot.homework22;

import java.util.ArrayList;

public class Student {
    private String name;
    private float averageGrade;

    public Student(String name, float averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}

