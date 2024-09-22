package com.bridgelabz.java8.steamApiPractice;

import java.util.Arrays;
import java.util.List;

public class Q2FindSumOfEvenAndOdd {

    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(1,96,544,684,75,2055);

        // My solutioning
        // Sum of Odd numbers
        Integer oddSum =  integerList.stream()
                .filter( e -> e % 2 ==0)
                .mapToInt(e -> e)
                .sum();

        System.out.println("sumOfOdd:"+ oddSum);


        //Sum of Odd
        Integer evenSum =  integerList.stream()
                .filter( e -> e % 2 ==0)
                .mapToInt(e -> e)
                .sum();

        System.out.println("evenNumSum:"+ evenSum);

    }
}
