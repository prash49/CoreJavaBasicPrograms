package com.bridgelabz.multiThreading;


import com.bridgelabz.multiThreading.employeeServiceimpl.EmployeeServiceImpl;
import com.bridgelabz.multiThreading.employeeServiceimpl.EmployeeServiceImplRun;
import com.bridgelabz.multiThreading.repository.EmployeeRepo;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService2;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DemoRun4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current thread" + Thread.currentThread().getName());

        EmployeeServiceImplRun employeeService = null;
        EmployeeRepo[] employeeRepos = {new EmployeeRepositoryImplService(), new EmployeeRepositoryImplService2(), new EmployeeRepositoryImplService3()};

        // make use of Executors service with fixed number of thread pool
        Long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < employeeRepos.length; i++) {
            employeeService = new EmployeeServiceImplRun(employeeRepos[i]);
            executorService.execute(employeeService);
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        Long timeTaken = (endTime - startTime);
        System.out.println("Time taken : " + timeTaken);
        System.out.println("current thread at finish :" + Thread.currentThread().getName());
    }
}
