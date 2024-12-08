package com.bridgelabz.designPatterns.builder;



public class BuilderPatternExample {
    public static void main(String[] args) {
        // create a computer  object using builder
        Computer computer = new Computer.ComputerBuilder("500", "32").build();
        // above method create Computer Object only with mandatory variables
        // if i need to add other variable i can create a new with
        Computer computer1 = new Computer.ComputerBuilder("512", "16")
                .setBluetoothNeeded(true)
                .setBluetoothNeeded(true)
                .build();

        System.out.println("hdd for computer :"+ computer.getHdd());
        System.out.println("hdd for computer1 :"+ computer1.getHdd());
        System.out.println("is Bluetoon enabled for computer :"+ computer.isBluetoothNeeded());
    }
}
