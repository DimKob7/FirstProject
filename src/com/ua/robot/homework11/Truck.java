package com.ua.robot.homework11;

public class Truck extends Car {
    private String trailer;
    private int axles;

    public Truck(String name, String type, int vehicleYear, String trailer, int axles) {
        super(name, type, vehicleYear);
        this.trailer = trailer;
        this.axles = axles;
    }

    public void check() {
        System.out.println("Check auto. " + name + " is " + type + " with " + axles + " axles! It's really big truck )! ");
    }

    public void loadingCargo() {
        this.name = name;
        System.out.println("Loading Cargo to " + name);
        super.stop();
        super.repeat();
    }

    public String isTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public int getAxles() {
        return axles;
    }

    public void setAxles(int axles) {
        this.axles = axles;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "trailer='" + trailer + '\'' +
                ", axles=" + axles +
                '}';
    }
}
