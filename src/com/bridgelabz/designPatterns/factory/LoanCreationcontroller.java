package com.bridgelabz.designPatterns.factory;

public class LoanCreationcontroller {
    public static void main(String[] args) {
        //ex in api request param we are getting lob {lob}
        // based on lob create a loanIntializer

        LoanInitializer loanInitializer = LoanInitalizerFactory.provideLoanIntializer("RETAIL");
        loanInitializer.loanApplicationCreation(new Object());
    }
}
