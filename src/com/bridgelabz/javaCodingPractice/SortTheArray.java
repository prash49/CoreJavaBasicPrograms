package com.bridgelabz.javaCodingPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheArray {

    public static void main(String[] args){


        // TODO write a program to sort the array in descending and ascending order

        // initialize a array
        int[] intArray =  new int[]{1,10,13,7,9,4};

        // or
        Integer integerArray[] = {1,4,2,90,45,3};

        int[] array = {1,0,15,96,2};


        /*todo there are 5 ways to sort an  array
           1.using Arrays.sort
           2.using lambda function 3.Arrays.sort with stream api
           4.Using Collections.sort
           5.Custom comparator
        * */

        // TODO 1. using Arrays.sort
        /*
        * solution if we have an array we can to modification on array using Array class functions ex: toList, .sort, toString etc*/

        Arrays.sort(array);
        // toPrint an array
        System.out.println(Arrays.toString(array));
        // above will sort in ascending order if we have to do descending use Collections.reverseOrder
        Arrays.sort(integerArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(integerArray));

        // TODO 2. using Lambda expression

        Arrays.sort( integerArray,(a,b) -> a - b );
        // if we do a-b sorting in ascending order if we do b -a it'll be descending order
        System.out.println(
        "sorted using lambda ->"+Arrays.toString(integerArray));

        //TODO 3. using Arrays.stream : stream Api

        Integer[] sortedArray =Arrays.stream(integerArray)
                .sorted()
                .toArray( Integer[]::new);
        
        System.out.println("Asecending streamSorted"+Arrays.toString(sortedArray));

        Integer[] descSortedArray = Arrays.stream(integerArray)
                .sorted((a,b) -> b - a)
                .toArray(Integer[]::new);
        System.out.println("desc sortedArray"+ Arrays.toString(descSortedArray));
        // or convert array to List and use stream on them and convertBack

        List<Integer> arrayList2 = Arrays.asList(integerArray);
        Integer[] array2 =arrayList2.stream()
                .sorted(Comparator.naturalOrder())
                .toArray(Integer[]::new);

        // TODO using Collections.Sort

        // to sort using collection need to convert the array to list by Arrays.asList

        List<Integer> arrayList = Arrays.asList(integerArray);
        Collections.sort(arrayList, Collections.reverseOrder());
        // to  convert back the list to Array use arraylist.toArray
        arrayList.toArray();

        // TODO using Comparator

        Arrays.sort(integerArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("sorted using Comparator :"+ Arrays.toString(integerArray));




        // Self Revision sort a array

        Integer[] array3 = {1,4,6,9};
        // using Arrays.sort
        Arrays.sort(array3, Collections.reverseOrder());
        // convert above into List
        List<Integer> arrayList3 =  Arrays.asList(array3);
        Collections.sort(arrayList3,Collections.reverseOrder());
        array3 = (Integer[]) arrayList3.toArray();
    }
}
