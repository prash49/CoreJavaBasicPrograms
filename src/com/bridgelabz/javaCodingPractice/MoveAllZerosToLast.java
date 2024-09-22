package com.bridgelabz.javaCodingPractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveAllZerosToLast {

    // TODO Write a program to move all the zero to end from Array int List

    // TODO 1.approch 1 loop through the list find num of zeros and remove them from list and append to last

    public static void main(String[] args) {
        int[] list = {1, 0, 1, 1, 0, 0, 1};

        // loop through the list
        int zeroCount = 0;
        for (int integer : list) {
            if (integer == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == 0) {
            System.out.println("no zeros in the given list");
        } else {
            System.out.println(zeroCount);
            int[] list2 = new int[list.length];
            System.out.println("size after -"+ (list.length - zeroCount));
            for (int i = 0; i < list.length - zeroCount; i++) {
                list2[i] = 1;
            }
            System.out.println("list2" + Arrays.toString(list2));
        }

      /*  // approach 2 works for all
        int nonZeroIndex = list.length - 1; // Index to place non-zero elements from the right
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] != 0) {
                list[nonZeroIndex] = list[i];
                nonZeroIndex--;
            }
        }

        // Fill the remaining elements on the left with zeroes
        for (int i = 0; i <= nonZeroIndex; i++) {
            list[i] = 0;
        }
        System.out.println(Arrays.toString(list));*/
    }
}
