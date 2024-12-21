package com.bridgelabz.multiThreadingSynchPractice;

import com.bridgelabz.multiThreading2.CounterSerive;
import com.bridgelabz.multiThreading2.CounterServiceImpl;
import com.bridgelabz.multiThreading2.Demo;

// extend by Thread and priovide run overriding method
public class DemoRun extends Thread {
    public static final int NUMBER_OF_THREADS = 2;
    public static final int COUNTER = 1000;
    private CounterService counterSerive;

    public DemoRun(CounterService counterService) {
        this.counterSerive = counterService;
    }


    public static void main(String[] args) {
        Thread[] threads = new Thread[NUMBER_OF_THREADS];
        CounterService counterService = new CounterService();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new DemoRun(counterService);
            threads[i].start();
        }
        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            try {
                threads[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("counter" + counterService.getCount());
    }

    @Override
    public void run() {
        for(int i = 0; i < COUNTER; i ++){
            counterSerive.incrementCounter();

        }
    }
}
