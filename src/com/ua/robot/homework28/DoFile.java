package com.ua.robot.homework28;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DoFile {
    private Path folder;
    private String fileName;

    private String text;

    public DoFile() {

    }

    public DoFile(String fileName) {
        this.fileName = fileName;
    }

    public DoFile(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
    }

    public DoFile(Path folder, String fileName, String text) {
        this.folder = folder;
        this.fileName = fileName;
        this.text = text;
    }

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

    public Path getFolder() {
        return folder;
    }

    public void setFolder(Path folder) {
        this.folder = folder;
    }

    public void createFile(Path folder, String fileName, String text) {
        this.folder = folder;
        this.fileName = fileName;
        this.text = text;

        System.out.println("Create file to path : " +this.folder+"\\"+this.fileName + " with text: " + this.text);

        try {

            if (!Files.isRegularFile(folder.resolve(fileName))) {Files.createFile(Path.of(fileName));}
            Files.write(folder.resolve(fileName), List.of(text));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readFile(Path folder, String fileName) {
        this.folder = folder;
        this.fileName = fileName;

        try {
            text = String.valueOf(Files.readAllLines(folder.resolve(fileName)));

        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return text;
    }
}
