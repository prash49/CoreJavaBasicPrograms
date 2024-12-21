package com.practice.service;

import com.practice.entity.Employee;

public class CustomComparator {

    public CustomComparator() {
    }

    public static int compareByName(Employee a, Employee b) {
        return a.getName().compareTo(b.getName());

    }

    public static int compareById(Employee a, Employee b) {
        return a.getId() - (b.getId());

    }
}
