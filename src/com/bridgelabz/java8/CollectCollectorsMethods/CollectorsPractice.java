package com.bridgelabz.java8.CollectCollectorsMethods;

import com.bridgelabz.java8.Student;

import java.util.*;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.Collectors;

public class CollectorsPractice {


    public static void main(String[] args){



        //TODO what is  .collect and Collector Methods

        /*  TODO Stream.collect() is Terminal Operation in Stream Interface  it returns Mutable object such
         * as  List, Set and Map accoring to Collector
         * */

        /* example */


        List<Integer> integerList = Arrays.asList(1,8,6,7,9,10);
        // now collect them into a list only which are Even and multiply them by 2 --> to find even we use  filter method  and Map to perform transformation

        List<Integer> evenList = integerList.stream().filter( i -> i % 2 == 0).map( i -> i * 2).collect(Collectors.toList());

        /*   Collector.toList() converts incoming stream back to List  */

        /* TODO Collector  interface have 4 Functions supplier() _> a function that creates and returns mutable object
          accumulator(), combiner() and finisher()
        */

        /* TODO Collectors Class have Static Methods */

        /*
        *  .toList, toMap , toSet
        *  .toCollection
        * Collectors.joining() , Collectors.counting(),  Collectors.collectingAndThen
        * TODO imp : Collectors.maxBy, minBy(),  summingInt , summingLong , summingDouble()
        *  TODO imp : Collectors.groupinhBy , Collectors.partionBy() , Collectors.averingInt,.averagingLong, double
        *   lets see all these with Student example
        * */


        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));

        /*todo 1.  Collectors.toList*/

        /* lets take students whose percentage is greater than 80  to List*/

        List<Student> stuentsAbove80Per = studentList.stream().filter( i -> i.getPercentage() > 80 ).collect(Collectors.toList());
        /* LETS get top performing students into the list*/
/*
*  idea is to sort the List based on Percentage by comparing and we need in Desc order to .reversed after sort and limit to 3 will help
* */
        List<Student> topPerformers = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
        topPerformers.stream().forEach(it -> System.out.println("StudentName :: "+ it.getName() + "percentage :: "+ it.getPercentage()));
        System.out.println(topPerformers);

        /*TODO Collectors.toSet()*/
         /* it returns a new Set  ex: i need only name set from the List --> so i need to Tranform name List */

        Set<String> nameSet = studentList.stream().map(Student::getName).collect(Collectors.toSet());
        System.out.println(nameSet);

        /*TODO Collectors.toMap: it returns a Map so map is Key value pair hence we have to mention key and values */
        Map<?,?> studentPercentageMap = studentList.stream().collect(Collectors.toMap(Student::getName,Student::getPercentage));
        System.out.println(studentPercentageMap);

        /*TODO Collectors.toCollection : it collects the Stream output into a new Collection */
        /* collecting only 3 Students into LinkedList*/

        LinkedList<Student>  studentLinkedList = studentList.stream().limit(3).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(studentLinkedList);

        /*TODO Collectors.Joining() : it will concatinate into one string by a defined delimiter ex: , . + etc*/
        /* ex collect all the name into a String by + delimiter*/

        String names = studentList.stream().map(Student::getName).collect(Collectors.joining("+"));
        System.out.println(names);

        /*TODO Collectors.counting : counts number of Elements*/
        /* count number of Students whose name starts with V*/

        Long nameCounter = studentList.stream().filter(i -> i.getName().startsWith("V")).collect(Collectors.counting());
        System.out.println(nameCounter);

        /* TODO MaxBy and MinBy */

        Optional<Double> maxPEr = studentList.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));
        Optional<Double> minPer = studentList.stream().map(Student::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println(maxPEr);
        System.out.println(minPer);

        /*TODO sum all the Percentage*/

        Double sumOfPercentage = studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));
        System.out.println(sumOfPercentage);

        /*TODO average Percentage */
        Double averageOfPercentage = studentList.stream().collect(Collectors.averagingDouble(Student::getPercentage));
        System.out.println(averageOfPercentage);

        /*TODO find all max min and avg using summeringDouble*/
        DoubleSummaryStatistics summaryStatistics = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getCount());

        /*TODO how to find Max min Avg and count for ArrayList */

        List<Integer> arrayList = Arrays.asList(54,54,8798,7,897,897,5);
        IntSummaryStatistics intSummaryStatistics = arrayList.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(intSummaryStatistics);
        /*TODO find max */
        arrayList.stream().max(Comparator.comparing(i -> i)).ifPresent( max -> System.out.println(max));
        Optional<Integer> max1 = arrayList.stream().max(Comparator.comparing(i ->  i));
        Optional<Integer> max2 = arrayList.stream().max((i1,i2) ->  Integer.compare(i1,i2));

        /*  TODO MIN */
        Optional<Integer> min1 = arrayList.stream().min(Comparator.comparing(i ->  i));
        Optional<Integer> min2 = arrayList.stream().min((i1,i2) ->  Integer.compare(i1,i2));

        /*TODO fin Avg*/

        OptionalDouble avg = arrayList.stream().mapToInt(i -> i).average();
        arrayList.stream().mapToInt(i -> i).average().ifPresent(avga -> System.out.println(avga));

        /*TODO sum*/
        Integer sum = arrayList.stream().mapToInt(i -> i).sum();
        System.out.println(sum);

        int sum1 = arrayList.stream().mapToInt(a->a).sum();
        System.out.println(sum);
        int min = arrayList.stream().mapToInt(a->a).min().orElse(0);
        System.out.println(min);
        int max = arrayList.stream().mapToInt(a->a).max().orElse(0);
        System.out.println(max);
        double average = arrayList.stream().mapToInt(a->a).average().orElse(0);
        System.out.println(average);

        //By using Collections
        System.out.println(Collections.min(arrayList));
        System.out.println(Collections.max(arrayList));

        /*TODO */
        /*TODO */
        /*TODO */
        /*TODO */
        /* IMP grouppingBy
        *  this method groups the elements  accoring to supplied classifier and returns results in a map
        * */

        /* TODO group the students by Subjects*/

        Map<String , List<Student>> studentGroupBySubjects = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(studentGroupBySubjects);

        List<String> strings = Arrays.asList("ABCD", "DFE", "AV", "ABC");
        Map<Integer, List<String>> stringsMap = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(stringsMap);

        /* todo PartionBy
            it partion the given input to Boolean and List based on the Predicate given under true and false key
        * */
/* TODO PRINT THE stuents whose Percentage is Greter than 80*/

        Map<Boolean, List<Student>> partioned = studentList.stream().collect(Collectors.partitioningBy(i -> i.getPercentage() >80));
        System.out.println(partioned);

    }


}
