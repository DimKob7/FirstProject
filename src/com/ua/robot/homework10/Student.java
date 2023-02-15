package com.ua.robot.homework10;

public class Student {
    private int idStudent;
    private String firstName;
    private String lastName;
    private int age;
    private int yearOfEducation;

    public Student(int idStudent, String firstName, String lastName, int age, int yearOfEducation) {
        this.idStudent = idStudent;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearOfEducation = yearOfEducation;
    }

    public void relax() {
        System.out.println("Student " + firstName + " " + lastName + " is relaxing!");
    }
    public void learn() {
        System.out.println("Student " + firstName + " " + lastName + " Go!Go!Go! The sun is high yet!");
    }

    protected void writeDiploma() {
        System.out.println("Student " + firstName + " " + lastName + "  is writing Diploma right now.");
    }


    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
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

    public int getYearOfEducation() {
        return yearOfEducation;
    }

    public void setYearOfEducation(int yearOfEducation) {
        this.yearOfEducation = yearOfEducation;
    }
    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", yearOfEducation=" + yearOfEducation +
                '}';
    }

}
