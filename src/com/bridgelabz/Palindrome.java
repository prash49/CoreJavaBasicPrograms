package com.bridgelabz;

public class Palindrome {

    // Write a program to check Given number is palindrome

    public static void main(String[] args){
        int input = 12345678;
        int reverse = 0;
        int temp = input;

        while (temp != 0){
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        System.out.println("reverseNumber"+ reverse);

        if(input == reverse) {
            System.out.println("palindrome");
        }
            // second solution make the number into half and try in a string
            if (palindrome(input)) {
                System.out.println("palindrome");
            } else{
                System.out.println("not a palindrome");
            }

    }

    private static boolean palindrome(int input) {

        String inputNum = String.valueOf(input);
        int length = inputNum.length();
        for (int i = 0; i < length / 2 ; i ++){
            // it'll compare the index values by ex:length 6 at first iteration i= 0 it'll take oth element from string and compares with 6-0-1 which is 5
            // because array starts from 0th index
            if (inputNum.charAt(i) != inputNum.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
