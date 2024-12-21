package com.bridgelabz.java8.functionalInterfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Supply {
    // supplier method accepts no input but still return the value
    // it have .get method

    public static void main(String[] args) {
        Supplier<LocalDate> localDateSupplier = () -> LocalDate.now();
        System.out.println("current time:"+ localDateSupplier.get());
    }
}
