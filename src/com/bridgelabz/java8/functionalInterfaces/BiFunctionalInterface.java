package com.bridgelabz.java8.functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionalInterface {
    // we had function interface where we need to take only one input type and return type
    // Function<T t, R r>  { R apply(T t)};
    // what if i need to provide two input and return type also to be mention
    // BiFunction<T t, U u,R r> {  R apply(T t, U u)
//}

    public static void main(String[] args) {
        BiFunction<Integer,Integer, Integer> operation  = (num1, num2) -> num1 + num2;
        System.out.println("so using bifunction interfaces abstract method:"+ operation.apply(12,23));
    }
}
