package com.bridgelabz.java8.steamApiPractice.practiceStreams;

import com.bridgelabz.java8.practiceComparatorAndMethodRef.GeneratorUtil;
import com.practice.entity.Employee;

import java.lang.management.OperatingSystemMXBean;
import java.util.*;
import java.util.stream.Collectors;

public class IntermediateAndTerminalOperations {

    public static void main(String[] args) {
        List<Employee> employeeList = GeneratorUtil.employees2();
        employeeList.stream().forEach(System.out::println);

        // use Distinct to filter out the Employee with same Ids by making hash and equal method overide in employee
        employeeList.stream().distinct().forEach(System.out::println);
        // skip the first record
        System.out.println("-------------------------------------------------");
        employeeList.stream().skip(1).forEach(System.out::println);
        // Limit
        System.out.println("-------------------------------------------------");
        employeeList.stream().limit(2).forEach(System.out::println);

        // Sort the integer in Natural and reverse order -- comparator have naturalorder and reverseorder
        List<Integer> list = Arrays.asList(12, 3, 4, 57, 8, 90);
        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::print);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);

        //now sort the Employee based on name and id ,
        employeeList.stream().sorted((Employee o1, Employee o2) -> o1.getId() - o2.getId());
        employeeList.stream().sorted((Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName()));
        // lets say i have implemented comparable class in Employee and overriden CompareTo method we can use sorted direclty but we mention
        // ordering way aswell
        employeeList.stream().sorted(Comparator.naturalOrder());
        employeeList.stream().sorted(Comparator.reverseOrder());

        //after sorting take only name start with "P"
        employeeList.stream().sorted((Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName())).filter(employee -> employee.getName().startsWith("Pr")).forEach(System.out::println);

        // dropwhile used to drop the record from list
        employeeList.stream().dropWhile(employee -> employee.getName().equalsIgnoreCase("P")).forEach(System.out::println);

        //take while also does same it'll check till the condition if condition true then it'll take afterwords records


        // all above are Intermediate
        // lets use Ternimal
        long count = employeeList.stream().count();

        // collect
        Set<Employee> employeeSet = employeeList.stream().filter(employee -> employee.getName().equalsIgnoreCase("P")).collect(Collectors.toSet());

        // min and max of id

        Optional<Employee> min = employeeList.stream().min((o1, o2) -> o1.getId() - o2.getId());
        Optional<Employee> max = employeeList.stream().max((o1, o2) -> o1.getId() - o2.getId());
        // findFirst
        Optional<Employee> optional = employeeSet.stream().findFirst();

        // reduce add all the id and check
        Optional<Integer> optional1 = employeeSet.stream().map(employee -> employee.getId()).reduce((o1,o2) -> o1 + o2 );
        // map for transforming
        // use Collectors.toList Collectors.toSet Collectors.toMap(Employee::getId, Employee::employee)


        // Group by  --. groupping by return map
        Map<Integer, List<Employee>> groupedEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getId, Collectors.toList()));


    }


}
