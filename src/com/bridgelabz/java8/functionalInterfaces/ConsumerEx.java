package com.bridgelabz.java8.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerEx {
    // consumer is guy who accepts something and consumes it doesn't repay back
    // consumer interface have one method which is abstract method accept(T t) void is return type
    // we can use this for consuming or printing stuff

    public static void main(String[] args) {
        Consumer<Integer> operation = num -> System.out.println("entered num is" + num);

        // lets implement accept method

        operation.accept(200);
    }
}
