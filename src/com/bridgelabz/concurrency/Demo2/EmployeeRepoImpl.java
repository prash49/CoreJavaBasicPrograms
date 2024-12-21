package com.bridgelabz.concurrency.Demo2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImpl implements EmployeeRepo {
    private static List<Employee> employees = new ArrayList<>();


    static {
        employees.add(new Employee("Prashanth", 1));
        employees.add(new Employee("Prashanth", 2));

    }


    @Override
    public void displayEmployess() {

    }
}
