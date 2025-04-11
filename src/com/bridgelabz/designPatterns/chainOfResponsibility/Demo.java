package com.bridgelabz.designPatterns.chainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        Handler manager = new Manager();
        Handler director = new Director();
        Handler ceo = new CEO();
        manager.next = director;
        director.next = ceo;
        manager.handleRequest("medium");

    }
}
