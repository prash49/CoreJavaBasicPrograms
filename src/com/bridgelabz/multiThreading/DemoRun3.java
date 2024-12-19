package com.bridgelabz.multiThreading;


import com.bridgelabz.multiThreading.employeeServiceimpl.EmployeeServiceImpl;
import com.bridgelabz.multiThreading.repository.EmployeeRepo;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService2;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService3;

public class DemoRun3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current thread" + Thread.currentThread().getName());

        EmployeeServiceImpl employeeService = null;
        EmployeeRepo[] employeeRepos = {new EmployeeRepositoryImplService(), new EmployeeRepositoryImplService2(), new EmployeeRepositoryImplService3()};
        Thread[] employeSeriveThread = new Thread[employeeRepos.length];

        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < employeeRepos.length; i++) {
            employeeService = new EmployeeServiceImpl(employeeRepos[i]);
            employeSeriveThread[i] = employeeService;
            employeeService.start();
        }
        for (int i = 0; i < employeSeriveThread.length; i++) {
            employeSeriveThread[i].join();
        }
        Long endTime = System.currentTimeMillis();
        Long timeTaken = (endTime - startTime);
        System.out.println("Time taken : " + timeTaken);
        System.out.println("current thread at finish :" + Thread.currentThread().getName());
    }
}
