package com.practice;

public class Demo2 extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            Thread thread = new Demo2();
            thread.run();
        }
    }

    @Override
    public void run() {
        // business logic
    }
}
