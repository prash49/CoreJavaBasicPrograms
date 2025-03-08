package com.bridgelabz.designPatterns.abstractFactoryReal;

class ElectricCar implements Car {
    public void drive() {
        System.out.println("Driving an Electric Car!");
    }
}

class PetrolCar implements Car {
    public void drive() {
        System.out.println("Driving a Petrol Car!");
    }
}

class ElectricBike implements Bike {
    public void ride() {
        System.out.println("Riding an Electric Bike!");
    }
}

class PetrolBike implements Bike {
    public void ride() {
        System.out.println("Riding a Petrol Bike!");
    }
}
