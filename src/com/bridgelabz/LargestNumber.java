package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        //Variables
        int number1, number2, number3;
        System.out.println("Enter 3  Integer Number to  check largest among");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter First number");
        number1 = scanner.nextInt();
        System.out.println("enter Second number");
        number2 = scanner.nextInt();
        System.out.println("enter Third number");
        number3 = scanner.nextInt();
        //
        int largestValue = (number1 > number2) ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
        System.out.println(largestValue + "  is largest in " + number1 + "," + number2 + "," + number3);

    }
}
