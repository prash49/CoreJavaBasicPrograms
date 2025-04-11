package com.bridgelabz.designPatterns.chainOfResponsibility;

public class CEO extends  Handler{
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("High")){
            System.out.println("CEO handles "+ request+" lvel requests");
        }
    }
}
