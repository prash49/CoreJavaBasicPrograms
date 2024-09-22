package com.bridgelabz.DSA.sorting;

import java.util.Arrays;

public class BubbleSort {
    // Bubble sort the sort the array to Asc order and desc based on condition


    // here we use two for loop 1. to iterate all the elements
    //2.to iterate and swap the highest element

    public static void main(String[] args){
        int[] arr = {11, 2, 3, 14, 5, 6, 17, 18, 9, 10};
        int count =0;
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j +1]) {
                    //swap
                    count++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
