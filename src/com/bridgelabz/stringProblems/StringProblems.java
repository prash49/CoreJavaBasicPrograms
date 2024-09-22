package com.bridgelabz.stringProblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringProblems {
     public static void main(String[] args){
         List<Integer> list = Arrays.asList(1,2,4,50);
         list.size();
         // list can have size not length

         int[] ints = new int[]{1,22,78,45};
         int length =     ints.length;

         char[] chars = new char[]{'a','b','c'};
         int charLength = chars.length;


         String aString = "Heello";
         aString.toCharArray();

         //TODO write a program to print words of length given size in a string
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter a string to print the words that matches length");
         String inputString = scanner.nextLine();
         System.out.println(inputString);
//         System.out.println("enter a integer number to print the words that matches length");
         try {
             int inputLength = 4;
             for(String str : inputString.split(" ")){
                 System.out.println(str);
                 if (str.length() == inputLength)
                     System.out.println("string:-" + str);
             }
         }catch (Exception e){
             e.printStackTrace();
         }


     }

}
