package com.bridgelabz.multiThreading;


import com.bridgelabz.multiThreading.employeeServiceimpl.EmployeeServiceImpl;
import com.bridgelabz.multiThreading.repository.EmployeeRepo;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService2;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService3;

public class DemoRun2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current thread" + Thread.currentThread().getName());

        EmployeeServiceImpl employeeService = null;
        EmployeeRepo[] employeeRepos = {new EmployeeRepositoryImplService(), new EmployeeRepositoryImplService2(), new EmployeeRepositoryImplService3()};

        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < employeeRepos.length; i++) {
            employeeService = new EmployeeServiceImpl(employeeRepos[i]);
            employeeService.start();
        }
        Long endTime = System.currentTimeMillis();
        Long timeTaken = (endTime - startTime);
        System.out.println("Time taken : " + timeTaken);
        System.out.println("current thread at finish :" + Thread.currentThread().getName());
    }
}
