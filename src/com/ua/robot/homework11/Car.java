package com.ua.robot.homework11;

public class Car {
    protected String name;
    protected String type;
    protected int vehicleYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public Car(String name, String type, int vehicleYear) {
        this.name = name;
        this.type = type;
        this.vehicleYear = vehicleYear;
    }

    public void check() {
        System.out.println("Check auto. " + name + " is " + type + " !");
    }

    public void checkParent() {
        System.out.println("Check auto. " + name + " is " + type + " !");
    }

    public void drive() {
        System.out.println(name + " is driving! ");
    }

    public void stop() {
        System.out.println(name + " STOP All!");
    }

    public void repeat() {
        System.out.println(name + " repeat current operation.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", vehicleYear=" + vehicleYear +
                '}';
    }
}
