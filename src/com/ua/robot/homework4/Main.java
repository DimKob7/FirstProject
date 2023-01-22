package com.ua.robot.homework4;

public class Main {
    public static void main(String[] args) {
        String sentence = "This is a sentence for a new homework assignment";
        int length = sentence.length();
        System.out.println("Original text:            "+sentence); //Original
        System.out.println("Text with toLowerCase:    "+sentence.toLowerCase());
        System.out.println("Text with toUpperCase:    "+sentence.toUpperCase());
        System.out.println("The first char from text: "+sentence.charAt(0));
        System.out.println("The last char from text : "+sentence.charAt(length-1));
    }
}
