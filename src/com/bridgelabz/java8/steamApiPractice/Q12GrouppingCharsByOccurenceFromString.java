package com.bridgelabz.java8.steamApiPractice;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q12GrouppingCharsByOccurenceFromString {

    //TODO write a program to collect number of occurences of character from String

    public static void main(String[] args){
         String input = "HEllo World";

         Map<Character, Long> characterCountMap = input.chars().mapToObj( c-> (char) c)
                                                     .collect(Collectors.groupingBy(c -> c,Collectors.counting()));

         characterCountMap.forEach(
                 (character, count) -> System.out.println("character:" + character + "  "+ count)
         );
    }
}
