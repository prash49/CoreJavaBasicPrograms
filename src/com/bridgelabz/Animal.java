package com.bridgelabz;


// TODO How to create a Singleton class which returns single instance of any class
public class Animal {
    private static Animal singleInstance = null;

    private Animal() {

    }
   public static Animal getInstance(){
        if(singleInstance == null){
            singleInstance = new Animal();
        }
        return singleInstance;
   }
}
