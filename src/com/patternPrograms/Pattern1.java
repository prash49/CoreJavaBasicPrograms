package com.patternPrograms;

public class Pattern1 {

    static void print(int n) {
        // Print like
// *
// * *
// * * *
// * * * *
//
        //outer loop
        for (int row = 1; row <= n; row++) {
            //inner loop
            for (int column = 1; column < row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        for (int row = 1; row <= n; row++) {
            //inner loop
            for (int column = 1; column < row; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }

    }
}
