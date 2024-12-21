package com.bridgelabz.java8.steamApiPractice.practiceStreams;

import com.bridgelabz.java8.practiceComparatorAndMethodRef.GeneratorUtil;
import com.practice.entity.Employee;
import com.practice.service.CustomComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class justStreams {

    public static void main(String[] args) {
        List<Employee> employees = GeneratorUtil.employees();

        // do it nornal take out List where name starts with P and Sort it according the Id

        List<Employee> filteredList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().startsWith("P")) {
                filteredList.add(employee);
            }
        }
        System.out.println("filtered list:" + filteredList);
        // now i need to sort the List
        // lets make use of Method Ref or Lamda
        // first lambda
        Collections.sort(filteredList, (o1, o2) -> o1.getId() - o2.getId());
        System.out.println("sorted list by id:" + filteredList);
        Collections.sort(filteredList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("sorted list by name:" + filteredList);

        //lets sort the same using method reference // where we need to use of CustomComparator
        Collections.sort(filteredList, CustomComparator::compareByName);
        System.out.println(filteredList);

        // lets enhance more with Streams...
        Stream<Employee> filteredStream = employees.stream().filter(employee -> employee.getName().startsWith("Pr"));
        // aboves gives us the Filtered stream i need sort that aswell
        Stream<Employee> sortedStream = filteredStream.sorted();
        // above will sort based default id i need based on Name make use of Compartor and comparable
        Stream<Employee> sortedStream2 = filteredStream.sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        // above it actual method but using lambda we can reduce the code
        Stream<Employee> sortedStream3 = filteredStream.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()));
        // lets reduce more using Method reference but it used the id to compare// if we need by using name create customComprator class with static methods // refer last
        Stream<Employee> sortedStream4 = filteredStream.sorted(Comparable::compareTo);
        sortedStream4.forEach(System.out::println);

        // now combine all above
         employees.stream().filter(employee -> employee.getName().startsWith("Pr")).sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);

    }
}
