package com.bridgelabz.javaCodingPractice;

import java.util.Arrays;

public class KthLargestNumber {

    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 9, 4, 7, 5, 8, 10,48,80};
        int position = 5;
        int kthLargest = findTheKthLargest(numbers, position);
        System.out.print("kthLargest :"+ kthLargest);
    }

    public static int findTheKthLargest(int[] numbers, int k) {
        Arrays.sort(numbers);
        return numbers[numbers.length - k];
    }
}
