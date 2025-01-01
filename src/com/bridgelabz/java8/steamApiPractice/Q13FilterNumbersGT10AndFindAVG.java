package com.bridgelabz.java8.steamApiPractice;
import java.util.Arrays;
import  java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q13FilterNumbersGT10AndFindAVG {

    // TODO Write a program to find the avg from Numbers list where number should be GT 10

    public static void main(String[] args){

        //Solutioning first

        List<Integer>  integerList = Arrays.asList(101,9,15,2,3,45,10);

        // first we will tranform the by filtering the stream to gt 10

      Double avg =  integerList.stream().filter(e -> e >10).collect(Collectors.averagingInt((value -> value)));

       System.out.println("method1"+integerList.stream().collect(Collectors.maxBy((o1,o2) -> o1 - o2)));
       // same can be written as
        System.out.println("method2:"+integerList.stream().max(((o1, o2) -> o1 - o2)));
        // if i dont need to give the comparator i need to convert the stream to int stream
        integerList.stream().filter(e -> e > 10).mapToInt(e -> e).max();
//        integerList.stream().filter(e -> e > 10).map(e -> e).max();

        int sum1 = integerList.stream().filter(e -> e >10).mapToInt(e -> e).sum();
      int sum2 =  integerList.stream().filter(e -> e > 10).collect(Collectors.summingInt(e -> e));
        System.out.println("sum:"+ sum1 + "-->sum2:"+ sum2);

       Double avgrge = integerList.stream()
               .filter(e -> e > 10)
               .mapToInt(e -> e)
               .average()
               .orElse(0.0);

       System.out.println(avgrge);
        System.out.println("averagingInt:"+ avg);

// using for loops

       Double sum = 0.0;
       int count = 0;
       for(int integer : integerList){
           if(integer > 10){
               sum += integer;
               count++;
           }
       }
        System.out.println("sum"+ sum);
       Double avgearage = sum / count;

       System.out.println(avgearage);

    }
}
