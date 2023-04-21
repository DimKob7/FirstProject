package com.ua.robot.homework27;

import java.io.*;
import java.util.Scanner;

public class DoFile {
    private String fileName;

    public DoFile() {

    }

    public DoFile(String fileName) {
        this.fileName = fileName;
    }

    public DoFile(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
    }

    private String text;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void createFileA(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
        System.out.println("Create file to path : " + this.fileName + " with text: " + this.text);

        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            // System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public void createFileB(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
        System.out.println("Create file to path : " + this.fileName + " with text: " + this.text);

        try (OutputStream os = new FileOutputStream(fileName); ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String readFileA(String fileName) {
        this.fileName = fileName;
        try (FileReader fileReader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(fileReader);
            text = scanner.nextLine();
            scanner.close();
        } catch (IOException e) {
            // System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return text;
    }
    public String readFileB(String fileName) {
        this.fileName = fileName;
        try (InputStream is = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(is)) {
            String s = (String) ois.readObject();
            System.out.println("New variant "+s);
            //(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return text;
    }
}
