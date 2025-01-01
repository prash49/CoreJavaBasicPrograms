package com.bridgelabz.java8.steamApiPractice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q8ConcatinateTheListToString {

    public static void main(String[] args){
        List<String> stringList = Arrays.asList("Apple","Banana", "Orange");

        String output = stringList.stream()
                .collect(Collectors.joining());

        System.out.println(output);
        // output is AppleBanana
        //i need to add comma in between need to use delimiter inbetween

        String output2 = stringList.stream()
                 .collect(Collectors.joining(","));

        System.out.println(output2);

        String output3 = stringList.stream()
                .collect(Collectors.joining(",", "[", "]"));
        // if need the same inside []
        System.out.println(output3);

    }
}
