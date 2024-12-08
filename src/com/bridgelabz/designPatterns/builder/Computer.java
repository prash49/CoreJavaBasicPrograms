package com.bridgelabz.designPatterns.builder;

public class Computer {
    // Required parameters
    private String hdd;
    private String ram;
    // optional params
    private boolean isGraphicCardNeeded;
    private boolean isBluetoothNeeded;

    public String getRam() {
        return ram;
    }

    public boolean isGraphicCardNeeded() {
        return isGraphicCardNeeded;
    }

    public String getHdd() {
        return hdd;
    }

    public boolean isBluetoothNeeded() {
        return isBluetoothNeeded;
    }

    // create private constructor enforcing object creation through builder

    private Computer(ComputerBuilder computerBuilder) {

    }

    public static class ComputerBuilder {
        // Required parameters
        private String hdd;
        private String ram;
        // optional params
        private boolean isGraphicCardNeeded;
        private boolean isBluetoothNeeded;

        // create constructor with mandatory params

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        // add setter methods for optional parameter

        public ComputerBuilder setGraphicCardNeeded(boolean graphicCardNeeded) {
            isGraphicCardNeeded = graphicCardNeeded;
            return this;
        }

        public ComputerBuilder setBluetoothNeeded(boolean bluetoothNeeded) {
            isBluetoothNeeded = bluetoothNeeded;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
