package com.ua.robot.homework14;

public class Teacher extends HomoSapiens {
    static final double INFLATION = 1.1d;
    static final double TAX_TEACHER = 0.2d;

    private String lastName;
    private String firstName;
    private int salary;

    Teacher() {
    }

    public Teacher(String lastName, String firstName, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public double getTax() {
        return salary * TAX_TEACHER * INFLATION;
    }
}
