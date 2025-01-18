package com.patternPrograms;

public class Pattern5 {
//         *
//       *   *
//      *  *  *
//       +   *
//         *

    static void print(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int numOfSpaces = n - totalColsInRow;
            for (int space = 0; space < numOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int column = 0; column < totalColsInRow; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void print2(int n) {
        for (int row = 0; row < n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int numOfSpaces = n - totalColsInRow;
            for (int space = 0; space < numOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int column = 0; column < totalColsInRow; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }

    static void print3(int n){
        for (int row = 0; row <= n; row++){
            // i need to print 1 star in first iteration and rest of are spaces
            for (int j = 0; j < n - row - 1  ; j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k < (2 * row) + 1 ; k ++){
                System.out.print("*");
            }
            for (int l = 1; l <= n - row -1 ; l ++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
