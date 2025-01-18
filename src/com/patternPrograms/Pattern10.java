package com.patternPrograms;

public class Pattern10 {
//    A
//    A B
//    A B C

    static void print(int n) {
        for (int row = 1; row < n; row++) {
            for (char ch = 'A'; ch <= 'A' + row; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
