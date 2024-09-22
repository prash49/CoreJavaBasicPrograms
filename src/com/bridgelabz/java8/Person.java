package com.bridgelabz.java8;


public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public String name;
    Gender gender;
    int age;

    Person(String name, Gender gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
