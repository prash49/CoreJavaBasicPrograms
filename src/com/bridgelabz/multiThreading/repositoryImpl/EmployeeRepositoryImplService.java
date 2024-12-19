package com.bridgelabz.multiThreading.repositoryImpl;

import com.prashanth.multiThreading.Employee;
import com.prashanth.multiThreading.repository.EmployeeRepo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImplService implements EmployeeRepo {
    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(1, "Prashanth"));
        employees.add(new Employee(5, "Navin"));
        employees.add(new Employee(6, "uday"));
        employees.add(new Employee(8, "Ravi"));
        employees.add(new Employee(7, "Praveen"));
    }

    @Override
    public void displayEmployess() {
        for (Employee employee : employees) {
            System.out.println("Name of the employee is :" + employee.getName());
        }
    }

    @Override
    public String toString() {
        return "EmployeeRepositoryImplService{}";
    }
}
