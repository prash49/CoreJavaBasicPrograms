package com.bridgelabz.designPatterns.builder;

// Real-time Usage
public class CarOrderWithBuilder {
    public static void main(String[] args) {
        Car car = new Car.Builder("V6")
                .color("Blue")
                .sunroof(true)
                .navigationSystem(true)
                .soundSystem("Harman Kardon")
                .build();

        System.out.println(car);
    }
}
