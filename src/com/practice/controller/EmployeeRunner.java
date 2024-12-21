package com.practice.controller;

import com.practice.service.EmployeeService;
import com.practice.service.EmployeeServiceImpl;
import com.practice.service.EmployeeThreadRunner;

public class EmployeeRunner {
    public static void main(String[] args) {
        EmployeeThreadRunner employeeThreadRunner = null;
        EmployeeService[] employeeServices = {new EmployeeServiceImpl()};
        Thread[] emplyeeService = new Thread[employeeServices.length];
        for (int i = 0; i < emplyeeService.length; i++) {
            employeeThreadRunner = new EmployeeThreadRunner(employeeServices[i]);
            emplyeeService[i] = new Thread(employeeThreadRunner);
            emplyeeService[i].start();
        }
        for (int i = 0; i < emplyeeService.length; i++) {
            try {
                emplyeeService[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println();

    }
}
