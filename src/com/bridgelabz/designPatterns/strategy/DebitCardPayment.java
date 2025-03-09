package com.bridgelabz.designPatterns.strategy;

public class DebitCardPayment implements PaymentStrategy{
    @Override
    public String pay(String params) {
        return "payment done by debit card";
    }
}
