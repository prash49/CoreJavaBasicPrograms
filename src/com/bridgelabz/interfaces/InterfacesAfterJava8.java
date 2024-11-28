package com.bridgelabz.interfaces;

public interface InterfacesAfterJava8 {
    // its provided due to interfaces can be expanded with out breaking existing the code,
    default void fun() {
        System.out.println("having  fun");
    }

    // static methods
    // if define a static methods we should provide implemtation
    // because static method can't overriden
    // subvClassed method should have better access modifier than extended

}
