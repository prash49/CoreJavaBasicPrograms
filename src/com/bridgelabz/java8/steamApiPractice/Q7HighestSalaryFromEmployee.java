package com.bridgelabz.java8.steamApiPractice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q7HighestSalaryFromEmployee {

    // TODO Q7: find the employee with higest salary

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Prashanth", 52000.0, 1),
                new Employee("Praveen", 45000.0, 2),
                new Employee("Navin", 35000.0, 3)
        );

        employeeList.stream().collect(Collectors.minBy((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())))
                .ifPresentOrElse( e -> System.out.println(e.getSalary()), () -> System.out.println("not found") );

        Optional<Employee> employee = employeeList.stream()
                                                        .max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println(employee.get().salary);
        employee.ifPresentOrElse( e -> System.out.println("max value :"+ e.getSalary()), () -> System.out.println("not found"));

        employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));

        employeeList.stream().max((o1,o2) -> o1.getId() - o2.getId());
        employee.stream().sorted(Comparator.comparingDouble(Employee::getSalary));
        employee.stream().sorted(Comparator.comparingInt(Employee::getId));
        employee.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName()));
        employee.stream().sorted(Collections.reverseOrder());
        employee.stream().sorted();
    }
}
