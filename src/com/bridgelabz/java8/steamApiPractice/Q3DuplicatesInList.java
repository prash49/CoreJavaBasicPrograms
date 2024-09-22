package com.bridgelabz.java8.steamApiPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Q3DuplicatesInList {
    public static void main(String[] args){
        // TODO find duplicates in given list below
        // 1. numbers

        // Without using Streams
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,1,2);

        List<Integer> duplicates = new ArrayList<>();

        Map<Integer, Integer> numberWithCount = new WeakHashMap<>(15);
        for(Integer number : integerList){
            if(numberWithCount.containsKey(number)){
                numberWithCount.replace(number, numberWithCount.get(number)+1);
            }else {
                numberWithCount.put(number, 1);
            }
        }

        // looping through the Keys of Map

        System.out.println("entrySet:"+ numberWithCount.entrySet());
        // entrySet is set which contains key value pairs of map
        System.out.println("keySet:"+numberWithCount.keySet());
        // iterating using Key entrySet

        for(Integer intKey : numberWithCount.keySet()){
            if(numberWithCount.get(intKey) > 1){
                duplicates.add(intKey);
            }
        }

        System.out.println("duplicates:"+duplicates);

        // above same can written in minimum no of lines using java streams

        List<Integer> duplicates2 = integerList.stream()
                .collect(Collectors.groupingBy(e-> e,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("duplicates by List2:"+ duplicates2);


        // Strings
        List<String> strings =  Arrays.asList("Prashanth", "Prashanth", "Navin", "Naving");
        List<String> duplicateStrings =  strings.stream()
                .collect(Collectors.groupingBy(e-> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("duplicateStringsIn list:"+duplicateStrings);

        Map<String, Long> duplicateStrings2 =  strings.stream()
                .collect(Collectors.groupingBy(e-> e, Collectors.counting()));

        System.out.println("duplicateString2:"+duplicateStrings2);
        //o/p duplicateString2:{Navin=1, Naving=1, Prashanth=2}
        // Groupping gives a map where inside grouping we giving key and value
    }


}
