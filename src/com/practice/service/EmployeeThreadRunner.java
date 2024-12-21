package com.practice.service;

public class EmployeeThreadRunner implements Runnable {
    private EmployeeService employeeService;

    public  EmployeeThreadRunner(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void run() {
        employeeService.displayEmployees();
    }
}
