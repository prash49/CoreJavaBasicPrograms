package com.practice.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class UsingExecutorsService {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.getAndIncrement();
            }
        });
        thread.start();
        System.out.println("counter:" + counter);
        // using runnable interface
        AtomicInteger counter2 = new AtomicInteger();

        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                counter2.getAndIncrement();
            }
        };
        Thread thread1 = new Thread(task);
        thread1.start();
        System.out.println("counter 2: " + counter2);

        // using executor serivice
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(task);
        executorService.shutdown();
        System.out.println("exe: " + counter2);
    }
}
