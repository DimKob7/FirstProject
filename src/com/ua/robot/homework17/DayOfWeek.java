package com.ua.robot.homework17;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int serialNumber;

    DayOfWeek(int serialNumber){
        this.serialNumber= serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getDay (int serialNumber){
        var days = DayOfWeek.values();
        String day = "";
        for (DayOfWeek dayOfWeek : days) {
            if (dayOfWeek.serialNumber == serialNumber) {
                day = dayOfWeek.name();
            }
        }
        return day;
    }
}
