package com.ua.robot.homework27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Dmitry\\FirstProject\\src\\com\\ua\\robot\\homework27\\";
        String fileName = "-File.txt";
        String textIn = "";
        System.out.println("Write some text: ");
        Scanner scanner = new Scanner(System.in);
        try {
            textIn = scanner.next();
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input! Stay calm and carry on!");
        }
        DoFile doFile = new DoFile();
        doFile.createFileA(path + "A" + fileName, textIn);
        System.out.println("Read file from " + path + "A" + fileName + " has next text: " + doFile.readFileA(path + "A" + fileName));
        doFile.createFileB(path + "B" + fileName, textIn);
        System.out.println("Read file from " + path + "B" + fileName + " has next text: " + doFile.readFileB(path + "B" + fileName));
    }
}
