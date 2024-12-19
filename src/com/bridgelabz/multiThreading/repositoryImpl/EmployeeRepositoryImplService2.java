package com.bridgelabz.multiThreading.repositoryImpl;

import com.prashanth.multiThreading.Employee;
import com.prashanth.multiThreading.repository.EmployeeRepo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImplService2 implements EmployeeRepo {
    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(21, "Prashanth"));
        employees.add(new Employee(25, "Navin"));
        employees.add(new Employee(26, "uday"));
        employees.add(new Employee(28, "Ravi"));
        employees.add(new Employee(27, "Praveen"));
    }

    @Override
    public void displayEmployess() {
        for (Employee employee : employees) {
            System.out.println("Name of the employee is :" + employee.getName());
        }
    }

    @Override
    public String toString() {
        return "EmployeeRepositoryImplService2{}";
    }
}
