package com.bridgelabz;

import javax.swing.*;
import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a interger number to reverse");
        int inputNumber = scanner.nextInt();
        int remainder =0 ;
        int outputNumber = 0;

        while (inputNumber > 0){
            remainder = inputNumber % 10;
            outputNumber = outputNumber * 10 + remainder;
            inputNumber = inputNumber / 10;
        }
        System.out.println("outputNumber ::"+ outputNumber);
    }
}
