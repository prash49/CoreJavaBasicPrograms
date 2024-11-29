package com.bridgelabz.exceptionHandling;

public class main {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          divide(a, b);

    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }

        return a / b;
    }
}
