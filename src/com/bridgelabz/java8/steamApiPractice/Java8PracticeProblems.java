package com.bridgelabz.java8.steamApiPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8PracticeProblems {

    public static void main(String[] args) {
        /* find min , max , sum and avg*/

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        int sum = listOfIntegers.stream().mapToInt(i -> i).sum();
        Double avg = listOfIntegers.stream().mapToInt(i -> i).average().getAsDouble();

        /* for above List print  max 3 and min 3*/
        listOfIntegers.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(i -> System.out.println(i));
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(i -> System.out.println(i));

        /* how to stream a String*/

        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(s1);
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        System.out.println(s2);

        /*TODO how to find sum of a Number ex: 123 sum is 6
         * */

        int number = 123456;
        int sumOfNumber = Stream.of(String.valueOf(number).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOfNumber);

        int summ = 0;
        while (number > 0) {
            summ = summ + (number % 10);
            number = number / 10;
        }
        System.out.println("without java8 " + summ);

        /* TODo find second largest number in an array*/

        int secondLargest = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        int secondLargest2 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest);

        /* given a list of String sort them accoring to their word lenth*/

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> sortedStringList = listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println("sortedList" + sortedStringList);
        /* According length group the String*/

        Map<Integer, List<String>> stringMap = listOfStrings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(stringMap);

        /*
         * TODO given int array find sum and avg*/

        int[] intArray = new int[]{1, 34, 5, 6, 7, 8};

        // conver int array to Strem
        int suming = Arrays.stream(intArray).sum();
        Double averageg = Arrays.stream(intArray).average().getAsDouble();
        System.out.println(suming);
        System.out.println(averageg);

        /*TODO find common elements from two arrays */
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        List<Integer> commonEle = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("common element " + commonEle);

        String str = "Java Concept Of The Day";
        /*TODO  rever the string using java 8*/

        // to convert string to stream Arrays.stream()

        String reverse = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverse);

        /* practice 2*/

        String str2 = "My Name Is Prashanth";

        String reverse2 = Arrays.stream(str2.split(" ")).map( word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
        System.out.println("rev :"+ reverse2);


        /*TODO find the Sum of first natural numbers */

        int intStreamSum = IntStream.range(1, 11).sum();
        System.out.println(intStreamSum);

//         IntStream.rangeClosed(1,10).mapToObj(i -> i % 2 == 0).forEach(System.out::println);

         /*TODO find the , find out those strings which start with a number?    */
        List<String> listOfStrings2 = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        listOfStrings2.stream().filter(i -> Character.isDigit(i.charAt(0))).forEach(System.out::println);

    }
}
