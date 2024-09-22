package com.bridgelabz;

import java.util.Scanner;

public class Factorial {

    public static  int factorial(int number){
        int fact= 1;

        for(int i = number; i >= 1; i --){

            fact = fact * i;

        }
        return fact;
    }

    public  static void main(String[] args){
        System.out.println("enter a digit to find factorial");
        Scanner scanner = new Scanner(System.in);
        int factNumber = scanner.nextInt();
        System.out.println("factorial of " + factNumber + " is " + factorial(factNumber));
    }
}
