package com.bridgelabz.javaCodingPractice;

import java.util.Arrays;
import java.util.Collections;

public class ZeroToEnd {

    public static void main(String[] args){
        int[] ints = {101,2,0,1,0,80};
        int j = 0;

        for(int  i = 0; i < ints.length ; i ++){
            if(ints[i] != 0 ){
                int temp = ints[i];
                ints[i] = ints[j];
                ints[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(ints));
        Arrays.stream(ints).forEach(System.out::println);

    }
}
