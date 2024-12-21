package com.bridgelabz.java8.steamApiPractice.practiceStreams;

import com.bridgelabz.interfaces.InterfacesAfterJava8;

import java.util.*;
import java.util.stream.Stream;

public class HowToCreateStream {
    // in this we going to learn how to generate Streams form Diff source code ex: from List , Array , set etc......

    public static void main(String[] args) {
        //1. list
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Groovy");
        languages.add("Pythod");
        // now convert into stream and print
        languages.stream().forEach(System.out::println);

        // 2.Set
        Set<Integer> randomNumber = new HashSet<>();
        randomNumber.add(100);
        randomNumber.add(44);
        randomNumber.add(10);
        randomNumber.add(800);
        randomNumber.stream().forEach(System.out::println);

        //3. Map map
        Map<String, String> map = new HashMap<>();
        map.put("ABCD", "DEF");
        map.put("abcd", "def");
        // we can create stream in map directly we need to get Entryset of it
        map.entrySet().stream().forEach(System.out::println);


        //4 array
        Integer[] arr = {10,53,66};
        Stream.of(arr).forEach(System.out::println);

        // Generate Randow number for size 6
        Stream.generate(() -> new Random().nextInt()).limit(6).forEach(System.out::print);
    }
}
