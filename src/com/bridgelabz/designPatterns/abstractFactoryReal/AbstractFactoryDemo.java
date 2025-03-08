package com.bridgelabz.designPatterns.abstractFactoryReal;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Get Electric Vehicle Factory
        VehicleFactory electricFactory = new ElectricVehicleFactory();
        Car electricCar = electricFactory.createCar();
        Bike electricBike = electricFactory.createBike();

        electricCar.drive();  // Output: Driving an Electric Car!
        electricBike.ride();  // Output: Riding an Electric Bike!

        // Get Petrol Vehicle Factory
        VehicleFactory petrolFactory = new PetrolVehicleFactory();
        Car petrolCar = petrolFactory.createCar();
        Bike petrolBike = petrolFactory.createBike();

        petrolCar.drive();  // Output: Driving a Petrol Car!
        petrolBike.ride();  // Output: Riding a Petrol Bike!
    }
}
