package com.bridgelabz.java8.MorePracticeProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Q29SeparateEvenOdd {

    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(12,8,7,97,74,85,10,3);

        Map<Boolean,List<Integer>> evenOddMap = integerList.stream().collect(Collectors.partitioningBy(i -> i % 2 ==0));
        System.out.println(evenOddMap.toString());
        // by using Partition by we are separating the stream into true false based , PartitionBy internally uses predicate
        // mean it take the expression and evaluates true or false
        //as in partitionBy does is its provide output as True and false along with List that stored in a map
        // ex: if the expression gives true then for true as a key it'll add upto into the list


        // How to iterate through
        // Entry in the map is key-value pair
        // entrySet  is a method in Map which returns collection-view of map for iteration ex: if i have map and

        /*
        *  Map<String, String> oneMap = new WeakHashMap<String,String>
        i'll add data
        * oneMap.put("India", "Delhi")
        * oneMap.put("England", "London");
        * if i do oneMap.entrySet() it'll give output of entry which again a Key-Value pair
        * hence we can create ref variable Map.Entry<String,String> entry =  oneMap.entrySet
        *
        * we can to iteration using the entry now  so each time it'll provide one entry
        * ex: for (Map.Entry<String, String> entry : oneMap.entrySet){
        * as we know entry is of Key value pair
        * entry.getKey and entry.getValue will fetch us respective key and value
        *
        * }
        * */

        // printing the Map

        Set<Map.Entry<Boolean, List<Integer>>> entrySet = evenOddMap.entrySet();

        for (Map.Entry<Boolean, List<Integer>> entry : entrySet)
        {
            System.out.println("--------------");

            if (entry.getKey())
            {
                System.out.println("Even Numbers");
            }
            else
            {
                System.out.println("Odd Numbers");
            }

            System.out.println("--------------");

            List<Integer> list = entry.getValue();

            for (int i : list)
            {
                System.out.println(i);
            }
        }

    }
}
