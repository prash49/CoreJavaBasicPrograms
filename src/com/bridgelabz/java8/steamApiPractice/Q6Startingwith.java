package com.bridgelabz.java8.steamApiPractice;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.List;

public class Q6Startingwith {
    // TODO find all ,starting with

    public static void main(String[] args){
        List<String> string = Arrays.asList("Prashanth", "Praveen", "Navin");

        string.stream()
                .filter(e -> e.startsWith("P"))
                .forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(12,15,18,225,95,111);

        integerList.stream()
                .filter(e -> String.valueOf(e).startsWith("1"))
                .forEach(System.out::println);
    }
}

