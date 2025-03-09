package com.bridgelabz.designPatterns.strategy;

import java.util.Scanner;

public class StrategyDesignPattern {
    public static void main(String[] args) throws Exception {
        Scanner scanner =  new Scanner(System.in);
        // in this example we are not taking any input from Params of API call instead we are taking from user
        System.out.println("select payment methods 1. debit card 2. credit card 3.upi");
        int input = scanner.nextInt();
        // now define a stragy class to fetch which stragey

        PaymentStrategy paymentStrategy = fetchStrategy(input);
        //pass the payment strategy based on it we have create a interface which implemted and takes the appropriate methdo
        // and process the payment
        paymentStrategy.pay("pay");
        // along with this we use builder pattern
    }

   static PaymentStrategy fetchStrategy(int input) throws Exception {
        switch (input){
            case 1:
                return  new CreditCardPayment();
            case 2:
                return new DebitCardPayment();
            case 3:
                return new UPIPayment();
            default:
                throw new Exception("select payment method");
        }
    }
}
