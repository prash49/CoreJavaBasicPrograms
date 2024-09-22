package com.bridgelabz.java8.steamApiPractice;

import java.util.Arrays;
import java.util.List;

public class Q18SkipFirst5FromList {

    public static void main(String[] args){
        List<String>  stringList = Arrays.asList("ABCD", "DEF", "GHI", "JKL", "MNO", "PQR","STU");

        stringList.stream().skip(5).forEach(System.out::println);
    }
}
