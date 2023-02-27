package com.ua.robot.homework14;

public class Main {
    public static void main(String[] args) {
        HomoSapiens s1 = new Student("Klinton", "Bill", 10000);
        HomoSapiens t1 = new Teacher("Doo", "John", 20000);
        System.out.println("\nThe student " + s1.getLastName() + " pay " + s1.getTax() + " USD tax every month.");
        System.out.println("\nThe teacher " + t1.getLastName() + " pay " + t1.getTax() + " USD tax every month.");

    }
}
