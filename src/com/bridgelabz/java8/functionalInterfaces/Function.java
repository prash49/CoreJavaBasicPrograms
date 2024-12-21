package com.bridgelabz.java8.functionalInterfaces;

public class Function {
    // we know java 8 has function interface which has one abstract method called apply  which take input T and return R
    public static void main(String[] args) {
        // define function using java 8 for incrementing the number;

        // check the import its from util
        java.util.function.Function<Integer, Integer> operation = num -> ++num;
        int result = operation.apply(40);
        System.out.println(result);

        // lets do the same for return positive or negative
        java.util.function.Function<Integer, Boolean> operation2 = num -> {
            if (num >= 0) {
                return true;
            } else return false;
        };
        System.out.println(operation2.apply(14));
        System.out.println(operation2.apply(-14));

        // lets bring down little more
        java.util.function.Function<Integer, Boolean> operation3 = num -> num >= 0;
        System.out.println(operation3.apply(50000000));

    }
}
