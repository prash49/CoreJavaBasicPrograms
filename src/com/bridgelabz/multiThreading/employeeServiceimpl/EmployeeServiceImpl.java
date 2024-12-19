package com.bridgelabz.multiThreading.employeeServiceimpl;


import com.bridgelabz.multiThreading.repository.EmployeeRepo;

public class EmployeeServiceImpl extends Thread {

    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public void run() {
        System.out.println("currentThread :" + Thread.currentThread().getName() + " started from fetching" + employeeRepo);
        employeeRepo.displayEmployess();
        System.out.println("currentThread :" + Thread.currentThread().getName() + " finished from fetching" + employeeRepo);

    }
}
