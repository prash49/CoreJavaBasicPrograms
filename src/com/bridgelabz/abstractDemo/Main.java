package com.bridgelabz.abstractDemo;

public class Main {
    public static void main(String[] args) {

        Son son =  new Son();
        son.name("prashanth");

        // Rules : you can have data members but u can't create a objects of abstract class
        // because if u able to create a abstract class u can able to call abstract methods through it
        // where for abstract class we are not provided implementation hence it won't allow
        // static methods can't be overriden so u can't define static abstract methods
        // static methods can be written
        // u can't create abstract constructor
        // it  can  have final variables
        Parent.staticParent();

    }
}
