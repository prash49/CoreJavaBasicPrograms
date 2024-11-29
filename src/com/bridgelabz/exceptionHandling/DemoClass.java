package com.bridgelabz.exceptionHandling;

public class DemoClass {

    public static void main(String[] args) {
//        main.divide(2,0);

        try {
            String name = "prashanth";
            if(name.equalsIgnoreCase("prashanth")){
                throw new MyException("My name isPrashanth");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }

    }
}
