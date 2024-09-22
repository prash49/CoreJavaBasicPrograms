package com.bridgelabz;

import java.util.Scanner;

public class ArmStrongNumber {

    /*
    * aramstrong number is a number  where its sum of all number by its power of count of digits in the number
    * 145 count = 3 1^3+4^3+5^3*/
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int armStrongCheck = inputNumber;
        int digitCount = digitCount(inputNumber);
        int sumofNumber = 0;
        while (inputNumber >0){
          sumofNumber = sumofNumber + (int) Math.pow(inputNumber % 10,digitCount);
          inputNumber = inputNumber / 10;
        }
        if(sumofNumber == armStrongCheck){
            System.out.println("armstrongNumber");
        }
    }


    static int digitCount(int number){

        int count = 0;

        while (number > 0){
            number = number / 10;
            count ++;
        }
        return count;
    }
}
