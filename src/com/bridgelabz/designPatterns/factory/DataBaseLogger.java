package com.bridgelabz.designPatterns.factory;

public class DataBaseLogger implements Logger
{
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
