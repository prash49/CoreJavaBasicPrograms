package com.bridgelabz.java8.practiceComparatorAndMethodRef;

import com.practice.entity.Employee;
import com.practice.service.CustomComparator;
import com.practice.service.CustomrComparatorForEmp;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.employees();
        System.out.println(employeeList);
        // now do the sorting we must have provided the Comparable compareto over ride already in Employee class
        Collections.sort(employeeList);
        // lets sort using name?
        Collections.sort(employeeList, new CustomrComparatorForEmp());
        System.out.println(employeeList);

        // lets provide comprator in method itself
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId() - o2.getId();
            }
        });
        System.out.println(employeeList);
        // lets reduce
      /*  Collections.sort(employeeList, (Employee o1, Employee o2) -> {
                    return o1.getName().compareTo(o2.getName());
                }
        );
        System.out.println(employeeList);*/

        // lets reduce little more
        Collections.sort(employeeList, (o1, o2) ->
                o1.getName().compareTo(o2.getName())
        );
        System.out.println(employeeList);

        // lets do the same using MethodRefernce , instead of creating a Class with Comparator implementation we have provided the
        // static class where it'll take input and provide the reponse
        Collections.sort(employeeList, (o1, o2) -> CustomComparator.compareById(o1, o2));
        System.out.println(employeeList);
        Collections.sort(employeeList, (o1, o2) -> CustomComparator.compareByName(o1, o2));
        System.out.println(employeeList);

        // using Method References
        Collections.sort(employeeList, CustomComparator::compareById);
        System.out.println(employeeList);
        Collections.sort(employeeList, CustomComparator::compareByName);
        System.out.println(employeeList);

    }
}
