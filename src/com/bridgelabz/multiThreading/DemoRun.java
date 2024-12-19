package com.bridgelabz.multiThreading;


import com.bridgelabz.multiThreading.employeeServiceimpl.EmployeeServiceImpl;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService2;
import com.bridgelabz.multiThreading.repositoryImpl.EmployeeRepositoryImplService3;

public class DemoRun {
    public static void main(String[] args) {
        System.out.println("Current thread" + Thread.currentThread().getName());

        EmployeeServiceImpl employeeService = null;

        Long startTime = System.currentTimeMillis();
        employeeService = new EmployeeServiceImpl(new EmployeeRepositoryImplService());
        employeeService.run();
        employeeService = new EmployeeServiceImpl(new EmployeeRepositoryImplService2());
        employeeService.run();
        employeeService = new EmployeeServiceImpl(new EmployeeRepositoryImplService3());
        employeeService.run();
        Long endTime = System.currentTimeMillis();
        Long timeTaken = (endTime - startTime);
        System.out.println("Time taken : "+ timeTaken);
        System.out.println("current thread at finish :"+ Thread.currentThread().getName());
    }
}
