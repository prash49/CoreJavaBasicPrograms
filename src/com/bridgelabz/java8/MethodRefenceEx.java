package com.bridgelabz.java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefenceEx {
    //

    public static void main(String[] abcd){
        List numbers = Arrays.asList(1,5,8,9,1000);

        // to print above number list using methodRefernce

        numbers.forEach(System.out::println); // passing as an argument

        //  method refernce are just for pass through for argumens/parameters without altering

        // method refernce can be used as Parameter/arg to other static methods as well

        numbers.stream().map(e -> String.valueOf(e)).forEach(System.out::println);

        //so in above we can minimize by using method refernce for String.value

        numbers.stream().map(String::valueOf).forEach(System.out::println); // passing as an argument to static method : in this case it it String class static method valueOf

        // method refence cal also pass as target

        numbers.stream().map(num -> num.toString()).forEach(System.out::println);
        // we can use method refence for num.toString before than convert to string using map

//        numbers.stream().map(e -> String.valueOf(e)).map(String::toString).forEach(System.out::println);


        // TODO when we have two arguments instead of one

//        numbers.stream().reduce(0, (total, e) -> Integer.sum(total, e));
// we can convert that into

//        numbers.stream().reduce(0, Integer::sum);

        // converting that into a string and concat

        /*numbers.stream().map(String::valueOf)
                .reduce(String::concat);*/

        // static method can't be referece by non static

        // TODO NOTE : Method refernce are usefull when we need to call static methods in a class

        //ex: multiple all the number in the list with 3

        List<Integer> numberss = Arrays.asList(1,5,8,9,1000);

        numberss.stream()
                .mapToInt(MethodRefenceEx::cal)
                .sum();
        // above code we are calclatin e * 3 instead of that we can write a method and call
        // TODO not the method should be static

    }

    public static int cal(int num){
        return num * 3;
    }
}
