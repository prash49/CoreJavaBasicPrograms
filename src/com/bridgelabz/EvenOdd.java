package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //Variable Declaration
        int number;
        System.out.println("Enter the integer value to Check even or odd");
        //To read input from Console
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if ((number % 2) == 0) {
            System.out.println("Number:" + number + " is Even.");
        } else {
            System.out.println("Number:" + number + " is Odd");
        }
    }
}
