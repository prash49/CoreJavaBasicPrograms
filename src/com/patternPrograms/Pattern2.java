package com.patternPrograms;

public class Pattern2 {

    static void print() {
        // Print 2 row with colums with numbers and *

        // 1st number of Row is 2 which means outer loop runs 2 times
        // and every row has 3 *'s
        //

        for(int row = 1; row <=2 ; row++ ){
            for (int column = 1; column <= 3; column++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------");
        for(int row = 1; row <=2 ; row++ ){
            for (int column = 1; column <= 3; column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
