package com.bridgelabz.DSA;

import java.util.Arrays;
import java.util.List;

public class SortArrayList {

    // Sort an Array using two pointer approach

    public static void main(String[] args) {
//        List<Integer> array = Arrays.asList(3,7,8,9,01);


        int[] array = {23,56,8,9,13};

        reverse(array);
        System.out.println(Arrays.toString(array));

    }

    private static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            swap(array, start,end);
            start++;
            end--;
        }

    }

    private static void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

}
