package com.bridgelabz.java8.steamApiPractice;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q4RemoveAllOccurenceCharFromString {
    // TODO Q4 Remove All occurences of a Char from input String

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to remove all occurences");
        String inputString = scanner.nextLine();
        System.out.println("enter a char to remove occurence from sentance /n"+ inputString);
        char ch = 'a';
        System.out.println("string:"+ removeChars(inputString, ch));
    }

    public static String removeChars(String input,char ch){
        if(input == null && input.isEmpty()){
            return  input;
        }
        return input.chars() // /chars() is method to convert string into stream
                .filter(c -> c != ch) // filtering out the character that not equals the given char
                .mapToObj(c -> String.valueOf( (char) c)) //
                .collect(Collectors.joining());    }

}
