package com.bridgelabz.java8.steamApiPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q16FilterTheObjectStoreInSet {

    // TODO Create a Set with Objects by filtering by Specific type
    // ex: Create a new Object of Type Transactions with fields like depositType, depositAmount

    public static void main(String[] args){
               List<Transactions>  transactionsList = new ArrayList<>();
               transactionsList.add( new Transactions("CASH", "50000"));
               transactionsList.add( new Transactions("CREDIT", "42000"));
               transactionsList.add( new Transactions("CASH", "96000"));

               String depositType = "CASH";

               // Filter only cash deposits add to set
           Set<Transactions> transactionsSet = transactionsList.stream()
                    .filter( transacation -> transacation.getDepositType().equals(depositType)  )
                    .collect(Collectors.toSet());


               transactionsSet.stream().forEach(System.out::println);
    }

    public static class Transactions{
        String depositType;
        String depositAmount;

        public String getDepositType() {
            return depositType;
        }

        public String getDepositAmount() {
            return depositAmount;
        }

        Transactions(String depositType, String depositAmount){
            this.depositType = depositType;
            this.depositAmount = depositAmount;
        }
    }
}
