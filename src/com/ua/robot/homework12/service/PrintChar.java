package com.ua.robot.homework12.service;

public class PrintChar {
   private static final int SIZE =40;
   private int [] arr = new int[SIZE];

    public void printDash(){
        for (int i:arr) {
            System.out.print("-");
        }
      System.out.println(" ");
    }
}
