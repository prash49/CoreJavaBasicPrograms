package com.bridgelabz.multiThreading;

import com.prashanth.multiThreading.employeeServiceimpl.EmployeeServiceImpl;
import com.prashanth.multiThreading.repository.EmployeeRepo;
import com.prashanth.multiThreading.repositoryImpl.EmployeeRepositoryImplService;
import com.prashanth.multiThreading.repositoryImpl.EmployeeRepositoryImplService2;
import com.prashanth.multiThreading.repositoryImpl.EmployeeRepositoryImplService3;

public class DemoRun2 {
    public static void main(String[] args) {
        System.out.println("Current thread" + Thread.currentThread().getName());

        EmployeeServiceImpl employeeService = null;
        EmployeeRepo[] employeeRepos = {new EmployeeRepositoryImplService(), new EmployeeRepositoryImplService2(), new EmployeeRepositoryImplService3()};

        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < employeeRepos.length; i++) {
            employeeService = new EmployeeServiceImpl(employeeRepos[i]);
            employeeService.run();
        }
        Long endTime = System.currentTimeMillis();
        Long timeTaken = (endTime - startTime);
        System.out.println("Time taken : " + timeTaken);
        System.out.println("current thread at finish :" + Thread.currentThread().getName());
    }
}
