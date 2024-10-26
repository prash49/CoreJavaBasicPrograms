package com.bridgelabz.designPatterns.factory;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
