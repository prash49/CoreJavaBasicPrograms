package com.bridgelabz.designPatterns.chainOfResponsibility;

public class Director extends Handler{
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("medium")){
            System.out.println("Director handles the "+ request +  " level requests");
        }else if (request != null){
            next.handleRequest(request);
        }

    }
}
