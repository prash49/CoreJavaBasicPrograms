package com.bridgelabz.java8.steamApiPractice;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q10FindFrequencyOfCharsInString {


    // TODO Write a program to find the squence of characters in a String ex: "aabb" a=2 b=2

    public static void main(String[] args){

        String input = "Prashanth";

        // Approach one

        Map<Character,Long>  charFrequency = input.chars() // Converts into a IntegerStream
                                                  .mapToObj(c -> (char) c) // to convert back Int to  respective charChar
                                                   .collect(Collectors.toMap(Function.identity(), c -> 1L , Long::sum));
        /*
        * .toMap converts stream to Map with key value pair using BiFunctional
        * Function.identity() serves as key mapper meaning each character is used as its own key*/


        // Approach two using groppingBy

        Map<Character,Long> characterLongMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



    }
}
