package com.bridgelabz.java8.steamApiPractice;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q11GroupStringListByLength {

    // TODO group the Strings by their length from string list

    public static void main(String[] args){

        List<String> stringList = Arrays.asList("Abcd", "bcde", "Prashanth", "Navin", "Prash", "prashanth");

        // by groupping i'll be getting the map with the length and list of string of same size so hence mapping them
        Map<Integer, List<String>>  stringLongMap = stringList.stream().collect(Collectors.groupingBy(String::length));

        stringLongMap.forEach(
                (length, stringsList) -> {
                    System.out.println("letterCount:"+ length + "  :"+ stringsList);
                }
        );
    }
}
