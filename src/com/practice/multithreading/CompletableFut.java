package com.practice.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFut {
    // we use completableFuture more in our project for asynchronous operations because it provide more structured and
    // convienent way to manage asynchronous tasks, and better for handling complex tasks
    // benifits
    // chaining operations : thenApply(), thencompose, whileComplete
    // Non blocking approach : which can improve responsiveness
    // build in thread pool management: used forkJoinPool
    public static void main(String[] args) {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Perform some time-consuming computation
            return 42;
        });
// Chain multiple asynchronous tasks
        future.thenApply(result -> result * 2)
                .thenAccept(finalResult -> System.out.println("Result: " + finalResult));
// Continue with other work

// Wait for the final result (non-blocking)
        future.join();
    }
}
