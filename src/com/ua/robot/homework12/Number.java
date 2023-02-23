package com.ua.robot.homework12;

public class Number extends Char {


    static {
        System.out.println(String.format(BODY_FORMAT, "Child static block initialization ") + (count += 1) + "|");
    }

    {
        System.out.println(String.format(BODY_FORMAT, "Child block initialization ") + (count += 1) + "|");
    }

    public Number() {
        System.out.println(String.format(BODY_FORMAT, "Child constructor ") + (count += 1) + "|");
    }

}
