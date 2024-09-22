package com.bridgelabz.java8.steamApiPractice;

import java.util.Arrays;
import java.util.List;

public class Q23FindSumOfSquareFromList {

    public static void main(String[] args){

        List<Integer> integerList  = Arrays.asList(1,2,3,4,5);

        int sumOfSquares = integerList.stream().mapToInt(c -> c * c).sum();
        System.out.println(sumOfSquares);
    }
}
