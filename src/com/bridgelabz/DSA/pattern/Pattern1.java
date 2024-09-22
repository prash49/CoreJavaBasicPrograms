package com.bridgelabz.DSA.pattern;

public class Pattern1 {

    public static void main(String[] args){
        printPattern(4);
        printPattern2(4);
        printPattern3(4);
    }

    static void  printPattern(int n){

        // Step to Solve any pattern program
        /* TODO
        * 1. Find How many row are there in the pattern ex: row is how many lines
        *  so we need to run the outer loop those many times
        *
        * 2. find how columns are there for each row , those many time we have to run
        *    inner loop
        *
        * 3. find what the element to print could be * or numbers etc
        *
        *
        *
        * */


            /*
            *                 *
            *                 * *
            *                 * * *
            *                 * * * *
            *
            *
            * in this patter we have 4 lines which means 4 rows that many times need to loop
            * the outer loop then for 1st row 1column is there so that many times inner loop will
            * run , 4th row has 4 columns so run 4 times inner loop
            * */


        for (int row= 1 ; row <= n; row++){ // outter loop

            for (int column= 1 ; column <= row; column++){  // we need to run as many times the column present for each row
                // in above pattern row is matching with column so column <= row

                // step three print pattern in single line

                System.out.print("* ");

            }
            // after running inner loop we have to go next line hence break the line
            System.out.println();


        }

    }


    static void printPattern2(int n){
        /*
                          @@@@
                          @@@@
                          @@@@
                          @@@@
        *  second pattern is a square which means 4 lines 4 rows
        *  each row contains as same number of columsn
        * */

        for (int row = 1; row <= n; row++) { // run outer loop for  4 times

            /* now inner loop is same as number row size of  means each row has 4 columns */

            for ( int column = 1 ;  column <= n ; column++) {
                System.out.print("@ ");
            }
            // break the line
            System.out.println();
        }
    }

  static void  printPattern3(int n){
        /*
                     * * * *
                     * * *
                     * *
                     *
        * */

      /* so here rows are 4 means 4 lines outer loop will run that many times
      * and inner loop 1st row has same number no of row columsn
      * 2nd row has no of row minus 1
      * 3rd row has no of rows mins 2
      * 4 row has 4 -3 */


      for ( int row = 1; row <= n ; row++ ) {
          for (int column = 1; column <= n - row + 1; column++) {
              System.out.print("* ");
          }
          System.out.println();
      }
    }
}
