package com.bridgelabz.designPatterns.strategy;

public class UPIPayment implements PaymentStrategy{
    @Override
    public String pay(String params) {
        return "payment done via upi";
    }
}
