package com.patternPrograms;

public class Pattern6 {

//    *******
//     *****
//      ***
//       *
//
    static void print(int n) {
        // outer loop run n times
        for (int row = 0; row < n; row++) {

            // 1st space
            // as we see in 1st row no spaces in second rwo 1 space 3rd row 2spaces which means it's eqaul to row
            for (int leftSpace = 0; leftSpace <= row; leftSpace++){
                System.out.print(" ");
            }
            //2nd print star
            //lets introduce extra var = 1 and increase it in each row
            // in first row all the stars are getting printed with out space like if i 4  , star will 2*n - row - 1 =  8 - 0 - extravar = 7
            // in second row  (2 * n) - row -1 = 8 - 1 - 2 =
            //in 3rd i should print 3 = 8 - 2 - 3= 3
            // 4th = 8 - 3 - 4  = 1

            // by watching videos got that formula would be 2* n - (2* row + 1)
            for (int space = 0; space < (2* n) - (2* row + 1) ; space ++){
                System.out.print("*");
            }
            for (int leftSpace = 0; leftSpace < row; leftSpace++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
