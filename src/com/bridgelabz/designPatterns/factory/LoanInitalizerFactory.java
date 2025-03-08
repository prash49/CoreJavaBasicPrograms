package com.bridgelabz.designPatterns.factory;

public class LoanInitalizerFactory {

    public  static  LoanInitializer provideLoanIntializer(String type){
        switch (type){
            case "RETAIL":
                return new RetailLoanIntializer();
            case "MSME":
                return new BusinessLoanInitializer();
        }
        return null;
    }
}
