package com.bridgelabz;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumOfNumbersExample {
    public static void main (String[] args){



        // TODO write a program to sum the number between range 1 to 5

        int num = 1;
        int sumRange = 0;
        while (num < 5){
            sumRange = sumRange + num;
             num ++;
        }
        System.out.println("sum:"+sumRange);


        // TODO write a program to sum even and odd number between the range

        System.out.println("Enter the integer value for start range");
        //To read input from Console
        Scanner scanner = new Scanner(System.in);
        int startRange = scanner.nextInt();
        System.out.println("Enter the integer value for end range");
        int endRange = scanner.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        while (startRange <= endRange){
            if(startRange % 2 == 0){
                sumEven = sumEven + startRange;
            }else
                sumOdd = sumOdd + startRange;
            startRange++;
        }
        System.out.println("evenSum:"+sumEven);
        System.out.println("oddSum:"+sumEven);

       //TODO write a program to count number of digits in  given number ex: 123 no of Dig = 3
        System.out.println("Enter the integer value to count number of digits in the number");

        int numberToCount = scanner.nextInt();
        int noOfDigits = 0;

        while (numberToCount > 0){
            numberToCount = numberToCount % 10;
            noOfDigits ++;
        }
        System.out.println("no Of digits in "+ numberToCount +" number is :"+ noOfDigits);

        // todo write a program to print the number in rever order ex: 1234 output 4321

        System.out.println("Enter the integer value to rever print");

        int numberToReverse = scanner.nextInt();
        int td = 0;

        while (numberToReverse > 0){
            td= numberToReverse % 10;
            System.out.println(td);
            numberToReverse = numberToCount / 10;
        }
        /*
      if input is 20  first to do modulus 20 by 10 which it gives us remainder 0 then divide  that 20 by 10 it gives 2 then 2 mod 10 is 2 so output would 02
        */
        System.out.println("no Of digits in "+ numberToCount +" number is :"+ noOfDigits);

       //TODO write a program to sum all digits in given number

        System.out.println("Enter the integer value to count number of digits in the number");
        int numberToSum = scanner.nextInt();
        int sumofNumber = 0;

        while (numberToSum > 0) {
            sumofNumber = sumofNumber + (numberToSum % 10);
            numberToSum =  numberToSum /10;
        }

        /* if given number is 123 mod by 10 gives us 3 as reminder sum = 0 + 3 = 3
         then divide 123 / 10 gives 12
         then mod of 12 % 10 is 2  3+2 = 5 and divide 12 /10 = 1.2 = 1
         then mod 1 % 10 is 1 3+2+1=5 then 1/10 0/0.1 = 0 it'll break while condition
    */



        //TODO : write a program to sum all the even  and odd digits present in the given Number ex : 128954547:  sumofodd= 1+9+5+5+7

        int number;
        int sum;
        System.out.println("Enter the integer value to  sum of its odd and even");
        //To read input from Console
        number = scanner.nextInt();
        int sumOfOdd = 0;
        int sumOfEven = 0;
        int remainder = 0;
        while (number > 0) {

            td = number % 10;

            if(td % 2 == 0 ){
                sumOfEven = sumOfEven + td;
            }else {
                sumOfOdd = sumOfOdd + td;
            }
            number = number / 10;
        }
        System.out.println("given number"+ number + "  oddSum:"+ sumOfOdd+"  evenSum:"+ sumOfEven);

        // TODO print a even  numbes from list but using lambda
        List<Integer> numberss = Arrays.asList(1, 146534, 86453, 86);
        numberss.stream().filter( e -> e % 2 == 0
        ).forEach(System.out::println);

        // to get sum of all the number
        numberss.stream().mapToInt(e -> e).sum();

        // todo print even number

        System.out.println(
                numberss.stream().filter( it -> it % 2 ==0).mapToInt( e -> e * 2).sum()
        );

    }
    // TODO above programs can be written using for loops aswell
    // TODO tip: /*
    //  to extract a last digit of given number do modulus which gives the remainder
    //  to extract all digits of given number except last digit do divison */






}
