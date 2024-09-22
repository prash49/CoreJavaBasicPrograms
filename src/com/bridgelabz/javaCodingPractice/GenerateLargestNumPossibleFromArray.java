package com.bridgelabz.javaCodingPractice;

import java.util.Arrays;
import java.util.Collections;

public class GenerateLargestNumPossibleFromArray {

    public static void  main(String[] args){

        Integer[] arr = {1,4,8,4,6,9};
        // sort the array with reverseOrder
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder largestNumber = new StringBuilder();
        // loop through array and add
        for(int digit : arr){
            largestNumber.append(digit);
        }
        System.out.print("largestNumber ::"+ largestNumber);
    }

}
