package com.bridgelabz.comparePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Prashanth"));
        employeeList.add(new Employee(5,"Navin"));
        employeeList.add(new Employee(2,"Praveen"));
        employeeList.add(new Employee(0,"Yethiksha"));

        // lets print the List
        System.out.println(employeeList);

        // lets sort the List based on Id using comparable to do we need implement comparable in employee class
        // once u implement that u need to over ride the compareTo method
        // lets do

        Collections.sort(employeeList);
        // after sorting based on id this does asec order
        System.out.println("afterSorting based on id using comparable:"+employeeList);


        // lets sort using name using comparator
        // to use comparator we need write one extra class where it'll implement Comprator and over comparemethod

        Collections.sort(employeeList, new CustomComparator());
        System.out.println("sorting based on name by using comparator:" +employeeList);


    }
}
