package com.bridgelabz.comparePractice;

import java.util.Comparator;

public class CustomComparator implements Comparator<Employee> {

    // we must have to give implementation to this method
    // to compare name we need like below
//    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
    // to compare the int we need below
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o1.getId() - o2.getId();
//    }
}
