package com.bridgelabz.java8.steamApiPractice;

import com.bridgelabz.java8.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q17NameOfOldestPersonFromObjList {

    // TODO Get name of first Oldest person in Persons list

    public static void main(String[] args){

        List<Person> people = Arrays.asList(new Person("Prashanth", 27),
                new Person("Praveen", 27),
                new Person("ABCD", 30));

        Optional<Person> person = people.stream()
                .max((p1, p2) -> Integer.compare(p1.getAge(),p2.getAge()));
        // or
        Optional<Person> person1 = people.stream().max((p1,p2) -> p1.getAge() - p2.getAge());
// or
        String firstName = person.map(Person::getName).orElse("Not found");
        people.stream().collect(Collectors.maxBy((p1,p2) -> p1.getAge() - p2.getAge() ));

    }

    public static  class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
