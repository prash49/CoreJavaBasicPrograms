package com.bridgelabz.DSA.sorting;

public class InsertionSort {

    // Insertion sort as name suggest insert data from temp when less than that

    public static void main(String[] args){

        int array[] = {9,1,8,7,3,6,5,4};

        insertionSort(array);

        for(int i : array){
            System.out.print( i+" ");
        }



    }

    private static void insertionSort(int[] array) {
        // need to start with 1st index so that we can compare the element with 0th index

        for (int i = 1; i < array.length; i++) {
            // need to swap the data to previous index if its less than current index value
            int temp = array[i];
            int j = i - 1;
            while ( j >= 0 && array[j] > temp) {
                array[ j + 1] = array[j]; // swap
                j--;
            }
            array[ j + 1] = temp;
        }
    }
}
