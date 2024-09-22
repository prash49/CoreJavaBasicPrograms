package com.bridgelabz.DSA.searching;

public class LinearSearch {

    // linear searching to find the element in an array

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};


        // linear search
        int targetNumber = 9;
//        int targetNumber = 12   use -1 as response from a method so that u can print number no found in given array

        int index = linearSearch(arr, targetNumber);

        if(index == -1){
            System.out.println(targetNumber+" number not found");
        }else{
            System.out.println(targetNumber+" number found in index" + index);
        }
    }


    static int linearSearch(int[] array, int targetNumer) {

        // linear search means sequential search
        int count =0;
        for (int i = 0; i < array.length; i++) {
            count ++;
            if (array[i] == targetNumer) {
                System.out.println("no of iteration take while :"+count);

                return i;
            }
        }
        System.out.println("no of iteration take while :"+count);
        return -1;
    }


}
