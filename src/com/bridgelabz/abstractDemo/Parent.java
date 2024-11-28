package com.bridgelabz.abstractDemo;

public abstract class Parent {
    int age;
    abstract void name(String name);
    abstract void parterner(String name, int age);
    static void staticParent()
    {
        System.out.println("its a static method in abstract class but not a abstract method");
    }
}
