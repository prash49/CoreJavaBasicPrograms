package com.bridgelabz.java8.steamApiPractice;

import java.util.*;

public class Q29FindSencondHigest {

    public static void main(String[] args){
        int[] numberss = {1,4,5,7,9,4};

        OptionalInt secondHigest = Arrays.stream(numberss).distinct()
                .sorted()
                .skip(numberss.length - 3 )
                .findFirst();

        System.out.println(secondHigest.getAsInt());



        int[] numbers = {5, 3, 9, 1, 6, 8, 9};  // Example array with duplicate highest value


        OptionalInt secondHighest = Arrays.stream(numbers)
                .distinct()  // Remove duplicates
                .sorted()
                .skip(numbers.length - 3)
                .findFirst();


        if (secondHighest.isPresent()) {

            System.out.println("Second highest number is: " + secondHighest.getAsInt());

        } else {

            System.out.println("Array does not have enough unique elements.");

        }




        int[] arr = {1,2,3,4,5};

        List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));

        Collections.max(list);

    }
}
