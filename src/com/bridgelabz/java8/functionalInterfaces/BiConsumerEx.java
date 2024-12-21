package com.bridgelabz.java8.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerEx {
    // we know consumer just accepts the data and return nothing same here in biConsumer aswell nothing much
    // it take two inputs so BiConsumer<T t, U u> { void accept(T t, U u) }
    public static void main(String[] args) {
        // lets impement print again
        BiConsumer<Integer, String> operation = (num, numInWords) -> System.out.println("number:"+ num + " in words:"+ numInWords );
        operation.accept(10, "Ten");
    }
}
