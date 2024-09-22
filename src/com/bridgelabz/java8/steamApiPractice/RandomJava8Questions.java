package com.bridgelabz.java8.steamApiPractice;

import java.util.*;
import java.util.stream.Stream;

public class RandomJava8Questions {
    public static void main(String[] args){

        Map<String, Integer> ages = new WeakHashMap<String, Integer>();

        ages.put("Robert", 30);
        ages.put("Mary", 25);
        ages.put("Peterson", 40);
        ages.put("Jinny", 35);

        // perform suming and avg above 30

        ages.entrySet().stream().
                filter(entry -> entry.getValue() > 30)
                .mapToInt(entry -> entry.getValue())
//                .average();
//                .sum() it can be done using reduce also
                .reduce(0, Integer::sum);


        Stream.of("spring", "hibernate", "jdbc")
                .map(s -> s.substring(2, 3))
                .forEach(System.out::print);


        Stream.of(1, 2, 3)
                .flatMap(n -> Stream.of(n, n * 2))
                .forEach(System.out::print);


        List<Integer> numbers = Arrays.asList(12, 8, 13, 24, 15);

        Optional<Integer> result = numbers.stream()
                .filter(n -> n > 25)
                .reduce((a, b) -> a + b);// give us empty
        System.out.println(result);
    }
}
