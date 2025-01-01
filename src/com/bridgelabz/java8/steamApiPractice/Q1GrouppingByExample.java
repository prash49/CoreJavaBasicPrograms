package com.bridgelabz.java8.steamApiPractice;

import com.bridgelabz.java8.Gender;

import java.util.*;
import java.util.stream.Collectors;

public class Q1GrouppingByExample {


    // TODO q1. How many Male and Female employess there in oragnization
    public static void main(String[] args) {

        // Way of Approaching in java 8 we can group the the List hence we following that and taking the count after grouping

        // Step1 create a list of Employees

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Prashanth", 27, Gender.MALE));
        employeeList.add(new Employee("Navin", 27, Gender.MALE));
        employeeList.add(new Employee("Praveen", 30, Gender.MALE));
        employeeList.add(new Employee("Teju", 28, Gender.FEMALE));
        employeeList.add(new Employee("Swathi", 28, Gender.FEMALE));


        Map<Gender, Long> employeeCountByGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("GenderCount "+ employeeCountByGender);

        Map<Gender,List<Employee>> employeeMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
        // what if i need to Avg the age in the Gender
        Map<Gender,Double> averagingInt = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        // lets whats the max age in genders
        Map<Gender,Optional<Employee>>  maxby = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy(Comparator.comparing(Employee::getAge))));

        // same can be written using IntSummaryStatistics
        Map<Gender,IntSummaryStatistics> summaryStatisticsMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.summarizingInt(Employee::getAge)));

        // partionin by

        Map<Boolean, List<Employee>> partitionBy = employeeList.stream().collect(Collectors.partitioningBy( e -> e.getAge() > 25));

        Map<Boolean,Long> partition = employeeList.stream().collect(Collectors.partitioningBy( e -> e.getAge() > 25, Collectors.counting()));

        employeeList.stream().max(((o1, o2) -> o1.getAge() - o2.getAge()));
    }


    public static class Employee {
        String name;

        public Employee(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        int age;
        Gender gender;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }
    }
}
