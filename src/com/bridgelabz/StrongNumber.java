package com.bridgelabz;

import java.util.Scanner;

public class StrongNumber {

    /*
    * strong number is a number whose sum of each digit factorial is eqauls its number ex: 145 = 1! + 4! + 5!*/

    // solution first find factorial of each numnber and compare

    public static void main(String[] args){
        System.out.println("enter a number to find Strong number or not");
        Scanner scanner =  new Scanner(System.in);
        int strongNumber = scanner.nextInt();
        int inputNumber = strongNumber;
        int sumOfFactStrongNumber = 0;

        // to find fact of each digit need to split the number by doing modulus and then divide by 10
        while (strongNumber > 0){
            sumOfFactStrongNumber = sumOfFactStrongNumber + Factorial.factorial(strongNumber % 10);
            strongNumber = strongNumber / 10;
        }
        if(sumOfFactStrongNumber ==  inputNumber){
            System.out.println("isAStrongNumber");
        }else {
            System.out.println("not a strong");
        }
    }
}
