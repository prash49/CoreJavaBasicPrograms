package com.bridgelabz.DSA.searching;

public class BinarSearch {

    // binary searching dividing the element into 2 parts of sorted array and check the targe > or < accordingly setting the starting and end poins

    public static void main(String[] args) {
        // binary search
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int targetNumber = 10;
//        int targetNumber = 12   use -1 as response from a method so that u can print number no found in given array

        int index = binarySearch(arr, targetNumber);

        if (index == -1) {
            System.out.println(targetNumber + " number not found");
        } else {
            System.out.println(targetNumber + " number found in index" + index);
        }
    }

    static int binarySearch(int[] array, int targetNumber) {

        int starting = 0;
        int endPoint = array.length - 1;
        System.out.println("size of the array is:" + array.length + " start:" + starting + " ending:" + endPoint);
        int count = 0;
        while (starting <= endPoint) {
            count++;
            int mid = (starting + endPoint) / 2;

            if (array[mid] == targetNumber) {
                System.out.println("iteration taken for finding element:" + count);
                return mid;
            } else if (targetNumber > array[mid]) {
                starting = mid + 1;
            } else
                endPoint = mid - 1;
        }
        System.out.println("iteration taken for finding element:" + count);
        return -1;
    }
}
