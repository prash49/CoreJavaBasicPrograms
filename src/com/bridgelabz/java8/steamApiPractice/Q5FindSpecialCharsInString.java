package com.bridgelabz.java8.steamApiPractice;

import java.util.stream.Collectors;

public class Q5FindSpecialCharsInString {
    // TODO Find special characters in a string

    public static void main(String[] args){

        String input = "My Name is Pr@$#ant#";

        findSpecialCharacters(input);
    }

    static void  findSpecialCharacters(String inputString){
      //  System.out.println(
                inputString.chars()
                .filter(c -> !Character.isLetterOrDigit(c)) // it checks and convert string  to int value associated with char
                .mapToObj(e -> String.valueOf((char) e)) // converting back char
               //.collect(Collectors.joining())
                .forEach(System.out::println);
       // );
    }

}
