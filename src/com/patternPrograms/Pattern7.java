package com.patternPrograms;

public class Pattern7 {
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
    static void print(int n){
        // row will run till 2 * n -1
        for (int row  = 0; row < (2 * n) - 1 ; row++){
            // star will be
            // till 1st half its eaqul to row size
            // after half which means n it'll be (2 * n)  - i ex: 6 it'll be 4 stars = 2  * n  == 10 - row = 10 - 6 = 4
            int stars = row > n ? 2 * n - row : row;
                for (int star = 1; star < stars; star++){
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
