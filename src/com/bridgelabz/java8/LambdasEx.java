package com.bridgelabz.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdasEx {

    // () -> {} so lambdas contains only parameter and body and  it'll eliminate the method name and ReturnType
    // it'll create a ananymous methods


    /*TODO lets get started with lambdas */

    // TODO example take a List of Integer number and print them

    public static void main (String[] args){

        List<Integer> numbers = new ArrayList<>();
        numbers = Arrays.asList(1,89,464,6845,45);

        // TODO using external iterators like for loop

        //TODO note: for Arrays we use .length and for list we use .size

        for(int i = 0; i< numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        // same above code can be written using for Loop
        for(int num: numbers){
            System.out.println(num);
        }

        // we can use internal iterators to iterate the above (ForEach) and using lambdas

        numbers.forEach( (Integer i) -> System.out.println(i)
        );

        // TODO instead of writing like above we can minimize in lamda it have type inference means if are iterating a list of Integer
        // it'll automatically refers interger

        numbers.forEach((i) -> System.out.println(i));

        // TODO to minimize the code  more if we have single paramter no need to define a paranthesis it is optional

        numbers.forEach(value -> System.out.println(value));

// if ur code has logic write in a function call from lambda instead of writin it in the lambda
// try not to put several lines of code



    }

}
