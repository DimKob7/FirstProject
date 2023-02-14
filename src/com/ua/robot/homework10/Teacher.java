package com.ua.robot.homework10;

public class Teacher {
    private int idTeacher;
    private String firstName;
    private String lastName;
    private int age;
    private int workExperience;

    public Teacher() {
        System.out.println("Default constructor");
    }

    public Teacher(int idTeacher, String firstName, String lastName, int age, int workExperience) {
        this.idTeacher = idTeacher;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.workExperience = workExperience;
    }

    public void vacation(){
        System.out.println(firstName + " " +lastName + " in vacation. ");
    }
    public void work(){
        System.out.println(firstName + " " + lastName + " is working right now.");
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "idTeacher=" + idTeacher +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperience +
                '}';
    }
}
