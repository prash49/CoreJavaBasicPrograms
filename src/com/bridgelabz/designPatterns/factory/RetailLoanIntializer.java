package com.bridgelabz.designPatterns.factory;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

public class RetailLoanIntializer implements LoanInitializer{
    @Override
    public String loanApplicationCreation(Object params) {
        //writing diffrent creation logic for borrower and dummy application
        return "application create uuid sdfgsdgdstghet5yrsed";
    }
}
