package com.bridgelabz.java8.steamApiPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q15FlattenTheList {

    public static void main(String[] args){

        List<List<Integer>>  listList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(5,4,6)
        );

        List<Integer> integerList = listList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());


        // without list

        List<Integer> list2 = new ArrayList<>();

        for(List<Integer> integerList1 : listList){
            list2.addAll(integerList1);
        }
        System.out.println(list2);
    }
}
