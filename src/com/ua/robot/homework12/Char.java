package com.ua.robot.homework12;


public class Char {
    protected static int count;
    static final String BODY_FORMAT = "|%-35s |";

    static {
        System.out.println(String.format(BODY_FORMAT, "Parent static block initialization ") + (count += 1) + "|");
    }

    {
        System.out.println(String.format(BODY_FORMAT, "Parent block initialization ") + (count += 1) + "|");
    }

    public Char() {
        System.out.println(String.format(BODY_FORMAT, "Parent constructor ") + (count += 1) + "|");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Char.count = count;
    }
}
