package com.bridgelabz.designPatterns.factory;

public class FileLogger implements Logger{
    public FileLogger() {
        super();
    }

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
