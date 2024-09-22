package com.bridgelabz.java8.steamApiPractice;
import java.util.Arrays;
import  java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Q13FilterNumbersGT10AndFindAVG {

    // TODO Write a program to find the avg from Numbers list where number should be GT 10

    public static void main(String[] args){

        //Solutioning first

        List<Integer>  integerList = Arrays.asList(101,9,15,2,3,45,10);

        // first we will tranform the by filtering the stream to gt 10


       Double avgrge = integerList.stream()
               .filter(e -> e > 10)
               .mapToInt(e -> e)
               .average()
               .orElse(0.0);

       System.out.println(avgrge);

// using for loops

       Double sum = 0.0;
       int count = 0;
       for(int integer : integerList){
           if(integer > 10){
               sum += integer;
               count++;
           }
       }
       Double avgearage = sum / count;

       System.out.println(avgearage);

    }
}
