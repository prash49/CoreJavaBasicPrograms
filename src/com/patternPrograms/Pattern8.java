package com.patternPrograms;

public class Pattern8 {
//    1
//    0 1
//    1 0 1
//    0 1 0 1

    static void print(int n) {
        int start = 1;
        for (int row = 0 ; row < n ; row ++) {
           start =  row % 2 == 0 ? start = 1 : start;
            for (int column = 0; column <= row; column++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }


    }
}
