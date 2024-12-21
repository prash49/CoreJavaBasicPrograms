package com.bridgelabz.multiThreading.employeeServiceimpl;


import com.bridgelabz.multiThreading.repository.EmployeeRepo;

public class EmployeeServiceImplRun implements Runnable {

    private EmployeeRepo employeeRepo;

    public EmployeeServiceImplRun(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public void run() {
        System.out.println("currentThread :" + Thread.currentThread().getName() + " started from fetching" + employeeRepo + " " + Thread.currentThread().getPriority() + Thread.currentThread().getState() + Thread.currentThread().isAlive());
        employeeRepo.displayEmployess();
        System.out.println("currentThread :" + Thread.currentThread().getName() + " finished from fetching" + employeeRepo);

    }
}
