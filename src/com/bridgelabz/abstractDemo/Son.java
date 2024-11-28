package com.bridgelabz.abstractDemo;

public class Son extends Parent {
    @Override
    void name(String name) {
        System.out.println("my name is"+ name);
    }

    @Override
    void parterner(String name, int age) {

        System.out.println("my partner name is"+ age);
    }
}
