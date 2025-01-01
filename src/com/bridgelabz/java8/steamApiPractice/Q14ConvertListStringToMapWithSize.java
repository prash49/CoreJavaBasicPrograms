package com.bridgelabz.java8.steamApiPractice;
import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q14ConvertListStringToMapWithSize {

    // TODO write a program to convert a string list to map  with key is string size and value  as size

    public static void main(String[] args){
        List<String> fruits = Arrays.asList("Apple", "Banana", "Kiwi");

        Map<String, Integer> stringIntegerMap =  fruits.stream().collect(Collectors.toMap(e -> e, String::length));

        Map<String, Integer> stringIntegerMap2 = fruits.stream().collect(Collectors.toMap(Function.identity(), String::length));
        stringIntegerMap.forEach(
                (fruit, size) -> System.out.println("fruitName:"+ fruit + " size:"+size)
        );

        // without stream

        Map<String, Integer> stringIntegerMap1 = new WeakHashMap<>();

        for(String string : fruits){
            stringIntegerMap1.put(string, string.length());
        }

        System.out.println(stringIntegerMap1);

    }
}
