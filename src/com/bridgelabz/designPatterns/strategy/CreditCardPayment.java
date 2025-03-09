package com.bridgelabz.designPatterns.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public String pay(String params) {
        return "payment done by credit card";
    }
}
