package com.bridgelabz.multiThreadingSynchPractice;

public class CounterService {

    private int count;

    synchronized void incrementCounter() {
        ++count;
    }

    int getCount() {
        return count;
    }
}
