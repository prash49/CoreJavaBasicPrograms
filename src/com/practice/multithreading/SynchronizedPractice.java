package com.practice.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedPractice {
    private int counter = 0;
    private int counter2 = 0;

    public void incrementCounter() {
        counter++;
    }

    public synchronized void incrementCounter2() {
        counter2++;
    }

    public int getCounter() {
        return counter;
    }

    public int getSynchronizedCounter() {
        return counter2;
    }

    private int counter3 = 0;

    public void incrementcounter() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            counter3++;
        } finally {
            lock.unlock();
        }
    }

    public int getCounter3() {
        return counter3;
    }

    public static void main(String[] args) {
        SynchronizedPractice synchronizedPractice = new SynchronizedPractice();
        // its normal run method implementation
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    synchronizedPractice.incrementCounter();
                }
            }
        };
        // lets use java 8 features like Lambda expression
        Runnable runnable1 = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedPractice.incrementCounter2();
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (
                InterruptedException ex) {
            ex.getMessage();
        }
        System.out.println("finalCount :" + synchronizedPractice.getCounter());

        Thread thread3 = new Thread(runnable1);
        Thread thread4 = new Thread(runnable1);
        thread3.start();
        thread4.start();
        try {
            thread3.join();
            thread4.join();
        } catch (
                InterruptedException ex) {
            ex.getMessage();
        }

        System.out.println("finalCount for synchronized :" + synchronizedPractice.getSynchronizedCounter());

        // let see the example for reentrant lock

        Runnable runnable2 = () -> {
            for (int i = 0; i < 100; i++) {
                synchronizedPractice.incrementcounter();
            }
        };
        Thread thread5 = new Thread(runnable2);
        thread5.start();
        try {
            thread5.join();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("renetrant lock :"+ synchronizedPractice.getCounter3());
    }
}

