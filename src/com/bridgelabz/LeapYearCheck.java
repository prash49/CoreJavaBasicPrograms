package com.bridgelabz;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        //variable to Store the year
        String leapYearCheck;
        System.out.println("Enter Year to Check it LeapYear or not");
        Scanner scanner = new Scanner(System.in);
        leapYearCheck = scanner.nextLine();
        //checking whether entred year have 4 digit or not
        if(leapYearCheck.length() ==4 ){
            //String to Int conversion
            int leapYear=Integer.parseInt(leapYearCheck);
            System.out.println("Entred year is:"+leapYear);
            if((leapYear % 4) == 0 && (leapYear % 100) != 0 || (leapYear % 400) == 0){
                System.out.println("Year:"+leapYear+"is LeapYear");
            } else {
                System.out.println("Year:"+leapYear+"is not a LeapYear");
            }
        }else {
            System.out.println("enter the valid Year of 4 digit ");
        }
    }
}
