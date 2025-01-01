package com.bridgelabz.java8.steamApiPractice;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q24StringListToThierRespectiveSizeIntList {

    public static void main(String[] args){

        List<String> fruits = Arrays.asList("Banana", "Apple");

        List<Integer> lengthList = fruits.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengthList);
    }
}

