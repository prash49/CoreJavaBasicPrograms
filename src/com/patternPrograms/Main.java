package com.patternPrograms;

public class Main {
    public static void main(String[] args) {
        //TODO steps to Follow while printing any pattern
        //1. Check No of Rows = Number of Lines == number of times Outer loop will run

        //2. identify for each row how many columns are there

        //3. what do u need to print in each row ex: *  or 1's or 123's

        Pattern1.print(5);

        System.out.println("--------------------------");
        // Pattern 2:
        // print 3 stars in each colum for 2 rows
        Pattern2.print();
        System.out.println("---------------------------");
        // Pattern 3 rever the first pattern
        Pattern3.print(3);
        System.out.println("---------------------");
        Pattern5.print(5);
        System.out.println("---------------------------");
        Pattern5.print2(5);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Pattern5.print3(5);
        System.out.println("----------------------------------------");
        Pattern6.print(4);
        System.out.println("-----------------------------------------");
        Pattern7.print(5);
        System.out.println("--------------------------------------------");
        Pattern8.print(5);


      printAnything(5);

    }

    static void printAnything(int n ){
        for (int row  = 0; row < n; row ++){
//            System.out.println(row);
            for (int column = row; column >= 1; column--){
                System.out.print(column);
            }
            System.out.println();
        }

    }

}
