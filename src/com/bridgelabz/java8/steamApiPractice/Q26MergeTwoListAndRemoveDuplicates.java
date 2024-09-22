package com.bridgelabz.java8.steamApiPractice;

import java.util.*;

public class Q26MergeTwoListAndRemoveDuplicates {

    public static void main(String[] args){

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(5,6,7,8,9);

        Set<Integer> integerSet = new HashSet<>();
        integerSet.addAll(list1);
        integerSet.addAll(list2);
        integerSet.forEach(System.out::println);


        List<Integer> integerList = new ArrayList<>(integerSet);    }
}
