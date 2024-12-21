package com.bridgelabz.java8.practiceComparatorAndMethodRef;

import com.practice.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class GeneratorUtil {
    public static List<Employee> employees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Prashanth"));
        employees.add(new Employee(2, "Navin"));
        employees.add(new Employee(4, "Pravin"));
        employees.add(new Employee(5, "Ravi"));
        return employees;
    }

    public static List<Employee> employees2() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Prashanth"));
        employees.add(new Employee(101, "Navin"));
        employees.add(new Employee(401, "Pravin"));
        employees.add(new Employee(501, "Ravi"));
        return employees;
    }
}
