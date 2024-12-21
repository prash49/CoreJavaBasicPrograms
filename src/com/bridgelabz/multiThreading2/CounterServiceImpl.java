package com.bridgelabz.multiThreading2;

public class CounterServiceImpl implements CounterSerive {
   private int counter;

    @Override
    public synchronized void incrementCount() {
        ++counter;
    }

    @Override
    public int getCount() {
        return this.counter;
    }
}
