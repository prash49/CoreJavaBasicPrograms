package com.bridgelabz.java8.steamApiPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q21PartitionEvenOdd {

    public static void main(String[] args){

        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenList = integerList.stream().filter(intger -> intger % 2 ==0).collect(Collectors.toList());
        List<Integer> oddList = integerList.stream().filter(intger -> intger % 3 ==0).collect(Collectors.toList());

        // do by partioning

//       List<boolean, List<Integer>> listList = integerList.stream().filter(Collectors.partitioningBy( c -> c % 2 ==0));
    }
}
