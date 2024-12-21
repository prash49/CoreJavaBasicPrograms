package com.bridgelabz.java8.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
    // Predicate interfacr has one abstract method which is test which takes one input and returns boolean
    // predicate<T> which is test(T t) return boolean

    public static void main(String[] args) {
        // use Predicate to check is the List is empty
        List<Integer> list = new ArrayList<>();

        Predicate<List<Integer>> operation = list2 -> list2.isEmpty();
        System.out.println(operation.test(list));

    }
}
