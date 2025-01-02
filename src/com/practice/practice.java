package com.practice;

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
        binarySearch(array,target);
        // bubble sort

        //selection sort

        // insertion sort



    }

    static  int binarySearch(int[] array, int target) {
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


}

