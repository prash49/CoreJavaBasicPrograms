package com.bridgelabz.java8.steamApiPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q9FindNonRepeatatingCharFromString {

    // TODO write a program find a first character that non repeating from the string
    // input string = "iindidda" output should be n

    // TODO 2 Approaches 1.Filter the characters : loop thorugh the String and store key values in the Map an then

    public static void main(String[] args){
        Map<Character, Integer> charCountIntMap = new WeakHashMap<>();

        String inputString = "aiidiianiia";
        inputString.chars().mapToObj(c -> (char) c)
                .forEach(e -> charCountIntMap.put(e,charCountIntMap.getOrDefault(e,0) + 1 ));

        Optional<Character> character = charCountIntMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        character.ifPresentOrElse(
                c -> System.out.println(c),
                () -> System.out.println("not fount")
        );


        //practice

        inputString.chars().mapToObj(c -> (char)(c)).forEach(System.out::println);
        System.out.println("-------------------------------------");
        inputString.chars().mapToObj(c -> Character.valueOf((char) c)).forEach(System.out::println);
        System.out.println("-------------------------------------");


        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        inputString.chars()
                .mapToObj(c -> (char) c)
                .forEach( e -> characterIntegerMap.put(e, characterIntegerMap.getOrDefault(e,0) + 1));
        System.out.println("characterIntegerMap" +characterIntegerMap);

        characterIntegerMap.entrySet()
                .stream()
                .filter(e -> e.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst().ifPresentOrElse(e -> System.out.println("key:"+ e) , () -> System.out.println("not found"));



    }
}
