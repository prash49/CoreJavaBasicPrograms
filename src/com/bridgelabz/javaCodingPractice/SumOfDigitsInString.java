package com.bridgelabz.javaCodingPractice;

import java.util.Scanner;

public class SumOfDigitsInString {

    public static void main(String[] args){
        // TODO q2. wrt code to sum the number in the string entered by user

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a String with numbericals");
        String inputString = scanner.nextLine();

        // TODO there are 2 ways to solve 1.using core java and 2. Streams

        int sum = 0;

        // my Approach
       /* char[] chars = inputString.toCharArray();
        for (char character : chars){

            if(isNumber(character)){
                sum = sum + character;
            }
        }*/



        // my solution didn't worked

        // TODO using coreJava by web
        for (char character : inputString.toCharArray()){
            System.out.println("character:"+character);
            if(Character.isDigit(character)){
                sum  += Character.getNumericValue(character);
            }
        }

        System.out.println("string:"+ inputString + " sumOfDigits:->"+sum);

        // TODO using java Streams

        //solution first convert string to stream by chars , filter only isDigit and tranform the char to numner and sum it

        int sum2 = inputString.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
        System.out.println("sum2 :"+sum2);

    }

    static boolean isNumber(char character){
        if(character >= 0 && character <=9 )
            return true;
        return false;

    }
}
