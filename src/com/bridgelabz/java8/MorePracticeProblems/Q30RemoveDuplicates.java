package com.bridgelabz.java8.MorePracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q30RemoveDuplicates {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        // we need to collect list with distinct value means no duplicates using java 8

        List<String> uniqueStrings = listOfStrings.stream().distinct().toList();
        // or
        List<String> uniqueStrings2 = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueStrings.toString());
        System.out.println(uniqueStrings2.toString());
    }
}
