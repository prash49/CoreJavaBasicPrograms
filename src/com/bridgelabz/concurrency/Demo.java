package com.bridgelabz.concurrency;

import com.practice.Demo1;
import com.practice.Demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// concurrency using Excecutors
public class Demo implements Runnable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            Runnable runnable = new Demo();
            executorService.execute(runnable);
        }
    }


    @Override
    public void run() {
        // some business logic
    }
}
