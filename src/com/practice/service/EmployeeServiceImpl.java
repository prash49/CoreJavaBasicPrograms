package com.practice.service;

import com.practice.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(1, "Prashanth"));
        employees.add(new Employee(2, "Navin"));
    }


    @Override
    public String toString() {
        return "EmployeeServiceImpl{}";
    }

    @Override
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("emp name:" + employee.getName());
        }
    }
}
