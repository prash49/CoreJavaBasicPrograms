package com.bridgelabz.concurrency.Demo2;

public class EmployeeService implements Runnable {
    static EmployeeRepo employeeRepo;

    EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public void run() {
        employeeRepo.displayEmployess();
    }
}
