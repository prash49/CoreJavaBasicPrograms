package com.bridgelabz.java8.steamApiPractice;

import com.bridgelabz.java8.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
