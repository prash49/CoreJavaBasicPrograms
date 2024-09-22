package com.bridgelabz.java8.steamApiPractice;

public class Employee {
    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    String name;
    Double salary;
    int id;

    public Employee(String name, Double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

}
