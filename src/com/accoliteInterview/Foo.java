package com.accoliteInterview;

class Foo {
    public static void main(String[] args) {
        boolean b = true;
        if (b = false) {
            System.out.print("A");
        } else if (b) {
            System.out.print("B");
        } else {
            System.out.print("C");
        }
    }
}