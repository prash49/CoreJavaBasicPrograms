package com.patternPrograms;

public class Pattern9 {
//    1
//    2 3
//    4 5 6
//    7 8 9 10
//    11 12 13 14 15

    static void print(int n){
        int num =1;
        for (int i = 1; i <= n; i ++){
            for (int j = 0 ; j < i ; j ++){
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }
}
