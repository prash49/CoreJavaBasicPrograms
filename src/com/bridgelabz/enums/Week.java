package com.bridgelabz.enums;

public class Week {

    enum WeekDays{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY

        // these Are enum constants
        // public static and final
        // type would weekDays

    }

    public static void main(String[] args) {
        WeekDays weekDays;

        weekDays = WeekDays.FRIDAY;
        System.out.println(weekDays);
    }
}
