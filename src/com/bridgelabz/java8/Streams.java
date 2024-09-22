package com.bridgelabz.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args){

        // list.stream()
        // we can add multiple filters like

        List<Integer> num = Arrays.asList(1,25,5,684);
        num.stream().filter( number -> number>5)
                .filter(number -> number % 2 ==0)
                .filter(number -> number * 2 > 1)
                .findFirst()
                .get();

        //to get sum by filtering we need to tranform the integer to int
        // code should be write like above instead of single line for better readibility
        num.stream().mapToInt(e-> e).sum();


        // TODO Fileter: used for filtering data of steams
        // filter takes input Stream<T> and Predicate<T>
        // the output of stream can be what ever the input given or 0  or some , depending on the Condition given
        // so 0 <= number of elements in the o/p of filer <= number of input

        // TODO Map : map used for transforming .
        // it takes input and provides the same number of output
        // Number of output == number of input
        // but the tranformed object can be of different type rather than the given input type
        // ex: u given int input that can be transformed into double also
        num.stream().map(e -> e * 3.0).forEach(System.out::println);

        // map is for transforming we can directly tranform int to double
        System.out.println(num.stream().mapToDouble(e  -> e));

        // both filter and map stay within their swimlanes

        // reduce
        //find the find the product of stream
        num.stream()
                .reduce(1, (carry, e) -> carry * e);


        // along filtering only even numbers

        num.stream()
                .filter(e -> e % 2 ==0)
                .reduce(1, (a,b) -> a * b);


        // sum is also a reduct operation

        num.stream()
                .mapToDouble(e -> e)
                .sum();


        //TODO COLLECT
        //  write a program to double the values and put into the list only even numbers from input list

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3,4,5);

        // below is example not to do in this way

        List<Integer>  doubleEvenNumbers = new ArrayList<>();

        for(int nums: numbers){
             if(nums % 2 ==0){
                 doubleEvenNumbers.add(nums * 2);
             }
        }

        // above is the code which can be reduced using java stream using filter for filtering the input steam
        // map is for transforming num * 2
        // forEach for looping and adding it into list

        doubleEvenNumbers.stream()
                .filter(e -> e % 2 ==0)
                .map(e -> e * 2)
                .forEach(e ->doubleEvenNumbers.add(e));

        // above ex is also not recommeded due to SharedMultability in the code

        // TODO to reduce the sharedMutalbility we are using collect

        List<Integer> list2 =
                numbers.stream()
                .filter(e -> e %2 ==0)
                .map(e -> e * 2)
                .collect(Collectors.toList());

        // write a program using steams to get a list with unique values of inputList double
        // toSet
        List<Integer> inputList = Arrays.asList(1,8,45,48,8,90,8);
        List<Integer> outputList = (List<Integer>) inputList.stream()
                .map(e -> e * 2)
                .collect(Collectors.toSet());


        // TODO toMap

        List<Person> personList = createPeople();
        // create a map with name and age as key and person as value

        personList.stream()
                .collect(Collectors.toMap(
                        person -> person.getName() + "-" + person.getAge(),
                        person -> person
                        ));

        // create a map where name is the key and people with same same name is the value
        // my solution
        personList.stream()
                .collect(Collectors.toMap(
                        Person::getName,
                   person -> personList.stream().filter(p -> p.getName().equals(person.getName())).collect(Collectors.toList())
                ));

        // solution from venkat subramanian by using groupingBy
        personList.stream()
                .collect(Collectors.groupingBy(Person::getName));

        // create a map where name is the key and with age as value of same name

        personList.stream()
                .collect(Collectors.groupingBy(Person::getName,Collectors.mapping(Person::getAge, Collectors.toList())));


        // write a program to loop throught the list and find the first even number which is greater than 3 and double it and print it for given below list

        List<Integer> numbersList = Arrays.asList(1,2,3,5,5, 6,8,9,5,4);

        // without java streams
        for(int number : numbersList){
            if(number > 3 && number % 2 ==0) {
               int output = number * 2;
               break;
            }
        }
        // so above line of code take approximately 7 units of time

        // with steams
        numbersList.stream()
                .filter(e -> e > 3) // checking greater than 3 value from the list
                .filter(e -> e % 2 ==0) // checkign isEven
        .map( e -> e * 2)// tranforming first even number to double using map
        .findFirst();// fidnig first

        //if we calculate it in a conventional way we might think that it'll take lot of time because first it'll filter all the elements in the list to check
        // whether its greater than 3 if array of length 10 it'll do 10 iteration so 10units
        // for second filter to check if the number is even again 10 units total 20
        // then again it'll tranform all 10 units over all it'll take 30 units

        // TODO but in Steams are lazy it wont get started the filtering first itself it'll just hold the values till it'll call .first soo
        // filters , map are intermediate operations and .findFirst is terminal operations, so it'll attach all the filter and map operations to build a pipeline
        // it'll execute only when it'll hit terminal operations and called as lazy evaluation


        // TODO refactor above code
        numbersList.stream()
                .filter(Streams::isGt3)
                .filter(Streams::isEven)
                .map(Streams::doubleIt)
                .findFirst();



        // TODO characters of Streams size, ordered, distinct, sorted

        // TODO sort the list

        List<Integer> numberss = Arrays.asList(1,2,3,5,5, 6,8,9,5,4);

        numberss.stream()
                .sorted();

        // TODO Distinct

        numberss.stream()
                .sorted()
                .distinct();

        // above require for List not for set

        // TODO create a infinite Steam

        Stream.iterate(100, e -> e + 1);

        // infinte stream can't exist without laziness ,


        //TODO given a number k, and count n find the total double of the the even number starting with k where sqauare of each number is > 20

        int k = 121;
        int n = 51;
        int result = compute(121, 51);

        System.out.println(result);




    }

    public static int compute(int k, int n){
        return  Stream.iterate(k, e -> e +1)
                .filter(e -> e % 2 == 0)
                .filter(e -> Math.sqrt(e) > 0)
                .mapToInt(e -> e * 2)
                .limit(n)
                .sum();
    }



    public static List<Person> createPeople(){
        return Arrays.asList(
          new Person("Prashanth", Gender.MALE, 27),
          new Person("Praveen", Gender.MALE, 27),
          new Person("Navin", Gender.MALE, 27)
        );
    }

    public  static boolean isGt3(int number){
        return number > 3;
    }

    public static boolean isEven(int number){
        return  number % 2 == 0;
    }

    public static int doubleIt(int number){
        return  number * 2;
    }

}

