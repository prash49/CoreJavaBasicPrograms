package com.bridgelabz.javaCodingPractice;

public class ReverseAString {

    // TODO reverse a String

    public static void main(String[] args) {
        String inputString = "Hello";

        // Reverse a String
        // TODO we can reverse a String using stringBuilder / easy way
        String revString = reverseAString(inputString);

        // Reverse a number

        Integer number = 123456;

        Integer revNumber = reverseANumber(number);

        System.out.println("String:" + inputString + " reversed String:" + revString);
        System.out.println("number:" + number + " reversed number:" + revNumber);


        String str = "Hello, World!";

        String reversed = reverseStringWithExtraVar(str);

        System.out.println("Original string: " + str);

        System.out.println("Reversed string: " + reversed);


        // TODO reverse a String without using third variable

        // TODO there are 3 ways using For loop , using while loop and using XOR

        // using for loop

        for (int i = inputString.length(); i > 0; --i) {
            System.out.print(inputString.charAt(i - 1));
        }

        // using while

        int i = inputString.length();
        while (i > 0) {
            System.out.print(inputString.charAt(inputString.length() - 1));
            i--;
        }
         String input = "ABCDEFG";
//        System.out.println("ReversedString method 3"+ reverse(inputString));
    }



    public static String reverseAString(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static  Integer reverseANumber(Integer number){
        String revString = new StringBuilder(number.toString()).reverse().toString();
        return Integer.parseInt(revString);
    }

    public static String reverseStringWithExtraVar(String str) {
        int length = str.length();
        StringBuilder reversed = new StringBuilder(length);
        for (int i = length - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

//    public static String reverse(String str) {
//        String reversed="";
//        int len = str.length();
//        for(int i = len - 1 ; i >=0 ; i++){
//            reversed+=str.charAt(i);
//        }
//        return reversed;
//    }
}



