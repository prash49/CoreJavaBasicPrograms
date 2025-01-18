package com.patternPrograms;

public class Pattern3 {
    // print like
//    * * *
//    * *
//    *

    static void print(int numberOfRow){
        //1st. number of Row is given so number of looping is known for outer
        //2 numbr of Columns in each Row its decreasing like 54321
        //3. to Print *
        int reduceColumn = numberOfRow;
        for (int row =1; row <= numberOfRow; row++){
            // i need to print number of rows first then reduce ex: in first row i'll print all but in next i'll reduce one
            // hence it'll run till n - i + 1
            for (int column = 1; column <= numberOfRow - row + 1 ; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");

        for(int row = 1; row <= numberOfRow; row ++ ){
            for (int column = 1 ; column <=numberOfRow - row + 1 ; column ++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
