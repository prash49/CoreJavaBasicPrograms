package com.bridgelabz.java8.steamApiPractice;

import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;
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

    }
}
