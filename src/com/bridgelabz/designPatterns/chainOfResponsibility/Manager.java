package com.bridgelabz.designPatterns.chainOfResponsibility;

public class Manager extends Handler{
    @Override
    public void handleRequest(String request) {
        if (request.equals("low")){
            System.out.println("Manager handled the "+ request + " request");
        }else if (next != null){
            next.handleRequest(request);
        }
    }
}
