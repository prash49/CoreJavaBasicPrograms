package com.bridgelabz.java8.steamApiPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Q7HighestSalaryFromEmployee {

    // TODO Q7: find the employee with higest salary

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Prashanth", 52000.0, 1),
                new Employee("Praveen", 45000.0, 2),
                new Employee("Navin", 35000.0, 3)
        );


        Optional<Employee> employee = employeeList.stream()
                                                        .max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println(employee.get().toString());
    }
}
