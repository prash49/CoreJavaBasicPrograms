package com.practice;

import com.practice.service.CustomComparator;

import java.util.*;

public class Person implements  Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    // if we are overiding equals method we need to over ride hashcod aswell
    //if below code is commented if u add two records with same name still it'll consider as 2 persons
    // but if u over ride the hashcode aswel based on name it'll consider as one
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person person = new Person("Prashanth", 27);
        Person person2 = new Person("Prashanth", 28);
        Person person3 = new Person("Navin", 29);
        Person person4 = new Person("Pravin", 31);

        HashSet<Person> hashSet =   new HashSet<>();
        hashSet.add(person);
        hashSet.add(person2);
        System.out.println("size :"+hashSet.size());
        System.out.println(person.equals(person2)); // if we don't overide the equals method it'll compare the Address not content if overide then it'll check
        // which content has to checked while .equals like based on name or age or both??
        System.out.println(person == (person2)); // just check the memory address
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());

        //  now add them into a list and check
        List<Person>  list = new ArrayList<Person>();
        list.add(person);
        list.add(person2);
        list.add(person3);
        list.add(person4);

        /*ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().);
        }*/

        list.forEach(
                person1 -> System.out.println(person1.getName()) // hence arraylist store insertion order
        );
        System.out.println("after sorting based on name");
        Collections.sort(list, (a,b) -> a.name.compareTo(b.name));
        list.forEach(
                person1 -> System.out.println(person1.getName()) // hence arraylist store insertion order
        );
        System.out.println("after sorting based on age");
        list.sort((a,b) -> a.getAge() - b.getAge());
        list.forEach(
                person1 -> System.out.println(person1.getName()) // hence arraylist store insertion order
        );
        // using Custom compartor implementations
        Collections.sort(list, new CustomCamparator());
        // if need comparable then u need to implement that in Person class
        // implemented comparable and implemented compareTo then it wont throw error
        Collections.sort(list);




    }


    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}
