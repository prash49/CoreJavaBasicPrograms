package com.bridgelabz.interfaces;

public interface InterfacesAfterJava8 {
    // its provided due to interfaces can be expanded with out breaking existing the code,
    default void fun() {
        System.out.println("having  fun");
    }

}
