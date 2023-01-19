package com.ua.robot.homework3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* Simple version
        int a=14;
        int b=7;
        System.out.println("Basic math operations:");
        System.out.println("1.Addition       =>  "+a+"+"+b+"="+(a+b));
        System.out.println("2.Subtraction    =>  "+a+"-"+b+"="+(a-b));
        System.out.println("3.Division       =>  "+a+":"+b+"="+(a/b));
        System.out.println("4.Multiplication =>  "+a+"*"+b+"="+(a*b));
        */
        Scanner scanner = new Scanner(System.in);  // Complex version
        System.out.print("Enter number a (only integer) : ");
        int a = scanner.nextInt();
        System.out.print("Enter number b (only integer, NOT 0) : ");
        int b = scanner.nextInt();
        System.out.println("Basic math operations:");
        System.out.println("1.Addition       =>  "+a+"+"+b+"="+(a+b));
        System.out.println("2.Subtraction    =>  "+a+"-"+b+"="+(a-b));
        System.out.println("3.Division       =>  "+a+":"+b+"="+(a/b));
        System.out.println("4.Multiplication =>  "+a+"*"+b+"="+(a*b));

    }
}
