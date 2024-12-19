package com.bridgelabz.comparePractice;

public class Employee implements Comparable<Employee> {

    // implementing compareable to do sorting based on it
    String name;

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    int id;

    public Employee(){

    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    // so as we know if we need to do sorting based on only one Variable then we go with comparable not comparator
    @Override
    public int compareTo(Employee o) {
        // it'll do ascending order
        // if we need desc order use o.id - this.id
        return this.id - o.id;
    }
}
