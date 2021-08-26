package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        //variables  harmonic expression starts with 1 always
        Float harmonicNumber = 1f;
        int number;
        System.out.println("Enter the number to Check Harmonic expression (1+ 1/2 + 1/3 + ....+ 1/N) ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        //execute only if number >0
        if (number != 0) {
            for (int i = 2; i <= number; i++) {
                System.out.println("i value:" + i);
                harmonicNumber += (float) 1 / i;
                System.out.println(harmonicNumber);
            }
            System.out.println("Harmonic Value of Number:" + number + " is :  " + harmonicNumber);
        }
    }
}