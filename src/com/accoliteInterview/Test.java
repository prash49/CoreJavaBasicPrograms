package com.accoliteInterview;

public class Test {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.print("Cat");
            }
        };
        Thread t = new Thread(r) {
            public void run() {
                System.out.print("Dog");
            }
        };
        Thread t2 = new Thread(r);
        t.start();
        t2.start();
        try {
            t.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}