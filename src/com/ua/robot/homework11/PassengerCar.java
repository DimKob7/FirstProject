package com.ua.robot.homework11;

public class PassengerCar extends Car {
    private int numberOfSeat;
    private String transmission;

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public PassengerCar(String name, String type, int vehicleYear, int numberOfSeat, String transmission) {
        super(name, type, vehicleYear);
        this.numberOfSeat = numberOfSeat;
        this.transmission = transmission;
    }

    public void check() {
        System.out.println("Check auto. " + name + " is " + type + " with " + numberOfSeat + " seats! It's really passenger car for drift)! ");
    }

    public void drift() {
        this.name = name;
        System.out.println("Car " + name + " is drifting right now!");
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "numberOfSeat=" + numberOfSeat +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
