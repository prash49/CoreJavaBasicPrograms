package com.bridgelabz.DSA.sorting;

import java.util.Arrays;

public class SelectionSort {

    //Compared the two by looping and takes that index and swap with started index

    // ex: if u start comparing first/ start point it'll check it is less than next if yes then it'll
    // take that index and again check with next index if that also less then pointer of smallest moved to that index
    // it'll loop though end check all with smallest of arry and swaps with the starting index
    // ex: for 1st iteration index start with 0 if it finds smallest element in the 5th index it'll swapp the value from 0th index with 5th index
    // in the next iteration index will start from 1 same process


    public static void main(String[] args){
        int[] array  = {1,89,0,45,9,4};

        for (int i=0; i < array.length - 1 ; i ++){
            int smallest = i; //it represents the starting index

            for( int j = i +1;j < array.length; j++ ){
                if(array[smallest] > array[j]){ // checl a[0] value is greate than a[j] then a[j] value is lesser than that a[smallest]
                    smallest = j;
                }
            }
            // from above far loop we found the index of smallest element now swap with ith index

            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));

    }
}
