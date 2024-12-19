package com.bridgelabz.multiThreading.repositoryImpl;

import com.prashanth.multiThreading.Employee;
import com.prashanth.multiThreading.repository.EmployeeRepo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImplService3 implements EmployeeRepo {
    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(31, "Prashanth"));
        employees.add(new Employee(35, "Navin"));
        employees.add(new Employee(36, "uday"));
        employees.add(new Employee(38, "Ravi"));
        employees.add(new Employee(37, "Praveen"));
    }

    @Override
    public void displayEmployess() {
        for (Employee employee : employees) {
            System.out.println("Name of the employee is :" + employee.getName());
        }
    }

    @Override
    public String toString() {
        return "EmployeeRepositoryImplService3{}";
    }
}
