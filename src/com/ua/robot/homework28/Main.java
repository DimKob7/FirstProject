package com.ua.robot.homework28;

import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  Path path = Path.of("C:\\Users\\Dmitry\\FirstProject\\src\\com\\ua\\robot\\homework28\\");
        Path path = Path.of("C:/Users/Dmitry/FirstProject/src/com/ua/robot/homework28/");
        String fileName = "File.txt";
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
        doFile.createFile(path, fileName, textIn);
        System.out.println("Read file from " + path + "\\" + fileName + " has next text: " + doFile.readFile(path,fileName));
    }
}
