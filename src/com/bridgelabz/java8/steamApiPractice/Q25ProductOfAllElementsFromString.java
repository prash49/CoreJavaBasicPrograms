package com.bridgelabz.java8.steamApiPractice;

import java.util.Arrays;
import java.util.List;

public class Q25ProductOfAllElementsFromString {

    public static void main(String[] args){

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        int product = integerList.stream().reduce(1, (a,b) -> a *b);
        System.out.println(product);
    }
}
