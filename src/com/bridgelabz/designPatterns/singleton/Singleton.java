package com.bridgelabz.designPatterns.singleton;

public class Singleton {
    // private static instance variable
    private static Singleton instance;
    // above is lazy instantion where instance gets assigned in some other method not while application starts
    private static Singleton instance2 = new Singleton();
    // above is Eager instanciation

    //Step2: create private constructor to avoid instantiation from outside
    private Singleton() {
        System.out.println("instantiation restricted to class level by using private");
    }

    // Step3 : create a static method to give Singleton class instance for outside of the class
    public static Singleton getInstance() {
        if (instance == null) {
            // create a instance of class
            instance = new Singleton();
        }
        return instance;
    }
}
