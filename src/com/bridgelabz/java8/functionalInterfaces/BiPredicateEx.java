package com.bridgelabz.java8.functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateEx {
    // like how we have Bifunction we have BiPredicate also to make the decisions easily lollll
    // lets see  as we know Predicate have test
    // BiPredicate<T t, U u> { Boolean test(T t, U u)}
    // return type is boolean // i think we use predicate in Comparator i guess not sure

    //lets impement maga

    public static void main(String[] args) {
        // look above to Implement its easyyy.. lets do compare 1 and second value
        BiPredicate<Integer, Integer> operation = (num1, num2) -> num2 < num1; // aste
        System.out.println("lets compare the number: "+ operation.test(120,100));
    }

}
