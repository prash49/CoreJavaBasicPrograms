package com.bridgelabz.java8.steamApiPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2FindSumOfEvenAndOdd {

    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(1,96,544,684,75,2055);

        // My solutioning
        // Sum of Odd numbers
        Integer oddSum =  integerList.stream()
                .filter( e -> e % 2 !=0)
                .mapToInt(e -> e)
                .sum();

        System.out.println("sumOfOdd:"+ oddSum);


        //Sum of Odd
        Integer evenSum =  integerList.stream()
                .filter( e -> e % 2 ==0)
                .mapToInt(e -> e)
                .sum();

        System.out.println("evenNumSum:"+ evenSum);


        int sumOfArray = integerList.stream().filter(i  -> i % 2 ==0 ).reduce(0, (a,b) -> a + b);
        System.out.println("sumOfArray:"+ sumOfArray);


        System.out.println("only taking PartionBy response:"+ integerList.stream().collect(Collectors.partitioningBy(n -> n % 2 ==0)));
        System.out.println(integerList.stream().collect(Collectors.partitioningBy(n -> n % 2 ==0, Collectors.summingInt(Integer::intValue))));
        System.out.println(integerList.stream().collect(Collectors.partitioningBy(n -> n % 2 ==0, Collectors.averagingInt(Integer::intValue))));
        System.out.println(integerList.stream().collect(Collectors.partitioningBy(n -> n % 2 ==0, Collectors.summingDouble(Integer::intValue))));
    }
}
