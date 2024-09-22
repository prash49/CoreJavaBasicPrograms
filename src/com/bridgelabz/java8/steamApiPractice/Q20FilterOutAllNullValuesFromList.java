package com.bridgelabz.java8.steamApiPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q20FilterOutAllNullValuesFromList {

    public static void main(String[] args){

        List<String> stringList = new ArrayList<>();
        stringList.add("abcd");
        stringList.add(null);
        stringList.add(null);
        stringList.add("efgh");


        List<String> list = stringList.stream()
                .filter(s -> s != null)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
