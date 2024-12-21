package com.bridgelabz.multiThreading2;

public class Demo extends Thread {

    // Demo to understand Synchronization
    // define how many threads we creating
    public static final int NUMBER_OF_THREAD = 2;
    //and to test synchronization we are using Counter method
    public static final int COUNT = 1000;
    //Create a Interface where it'll have getCount and increment count we need to Increment count using Thread run method
    private CounterSerive counterSerive;

    // constructor to assign a serviceimp
    public Demo(CounterSerive counterSerive) {
        this.counterSerive = counterSerive;
    }

    public static void main(String[] args) {
        CounterSerive counterSerive = null;
        // thread creating
        Thread[] threads = new Thread[NUMBER_OF_THREAD];
        counterSerive = new CounterServiceImpl();
        for (int i = 0; i < NUMBER_OF_THREAD; i++) {
            // running threads
            threads[i] = new Demo(counterSerive);
            threads[i].start();
        }
        for (int i = 0; i < NUMBER_OF_THREAD; i++) {
            try {
                threads[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Count from service class is:"+ counterSerive.getCount() + " expected count is " + (NUMBER_OF_THREAD * COUNT));
    }

    // providing override method to give the Implementation for increment count
    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            counterSerive.incrementCount();
        }
    }
}
