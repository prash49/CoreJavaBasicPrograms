package com.patternPrograms;

public class Pattern11 {

    static void print(int n) {
        int intialSpace = 0;

        for (int row = 0; row < n; row ++){
            // stars
            for (int star = 0; star< n - row ; star ++){
                System.out.print("*");
            }
            // spaces
            for (int s = 0; s < intialSpace; s++){
                System.out.print(" ");
            }
            //Stars again
            for (int star = 0; star< n - row ; star ++){
                System.out.print("*");
            }
            intialSpace += 2;
            System.out.println();
        }
    }
}
