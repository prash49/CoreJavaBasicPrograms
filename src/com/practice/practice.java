package com.practice;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int number = 123456;
        // reverse a number
        int reverse = 0;
        int remainder = 0;
        while (number != 0) {
            remainder = number % 10;
            System.out.println("remainder :" + remainder);
            reverse = reverse * 10 + remainder;
            System.out.println("reverse :" + reverse);
            number = number / 10;
            System.out.println("number :" + number);
        }

        // linear search in array
        int[] array = {15, 66, 85, 450};
        int target = 85;
        for (int num : array) {
            System.out.println(num);
            if (num == target) {
                System.out.println("found");
            }
        }

        String str = "Prashanth";
        System.out.println("subString between 1,5" + str.substring(1, 5));
        System.out.println("subString between 0" + str.substring(0));
        System.out.println("subString between 1" + str.substring(1));
        System.out.println("subString between 5,7" + str.substring(5, 7));
        System.out.println("subString between 7,8" + str.substring(7, 8));
        System.out.println("subString between 9" + str.substring(8, 9));
        System.out.println("subString between 7" + str.substring(7));


        // binary search
        binarySearch(array, target);
        // bubble sort
        bubbleSort(array);
        System.out.println("bubble sort:"+Arrays.toString(array));
        //selection sort
        int[] array2 = {654, 78, 787, 40};
         selectionSort(array2);
        System.out.println("selection sort: "+ Arrays.toString(array2));
        // insertion sort


    }

    static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == array[mid]) return mid;
            if (target < mid) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }

    // sorting
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // selection sort
    static void selectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[smallest] > array[j]){
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
    }


}

