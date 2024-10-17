package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewQuestion2 {

    public static void main(String[] args) {
        /*Given an array, remove odd numbers, multiply each remaining number by a constant, and return the sum using Java streams.*/
        List<Integer> numbers = Arrays.asList(5,9,7,8,14,52,2);
        int sum = numbers.stream().filter(i -> i % 2 == 0 ).mapToInt( i -> i * 3).sum();
        System.out.println(sum);
    }
}
