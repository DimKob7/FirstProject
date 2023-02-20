package com.ua.robot.homework11;

public class Main {
    public static void main(String[] args) {
        Truck kraz = new Truck("Kraz", "Truck", 2000, "Trailer-yes", 3);
        kraz.drive();
        kraz.loadingCargo();
        kraz.checkParent();
        kraz.check();
        PassengerCar maclaren = new PassengerCar("Maclaren", "sportcar", 1999, 2, "Auto");
        maclaren.drift();
        maclaren.checkParent();
        maclaren.check();
    }
}
