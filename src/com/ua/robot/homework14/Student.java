package com.ua.robot.homework14;

public class Student extends HomoSapiens {
    static final double TAX_STUDENT = 0.05d;
    private String lastName;
    private String firstName;
    private int scholarship;
    //   private double tax;

    public Student() {
    }

    public Student(String lastName, String firstName, int scholarship) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.scholarship = scholarship;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public double getTax() {
        return scholarship * TAX_STUDENT;
    }

}
