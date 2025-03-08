package com.bridgelabz.designPatterns.builder;

// Car class with Builder Pattern
public class Car {
    private final String engineType; // Required
    private final String color; // Optional
    private final boolean sunroof; // Optional
    private final boolean navigationSystem; // Optional
    private final String soundSystem; // Optional

    // Private constructor
    private Car(Builder builder) {
        this.engineType = builder.engineType;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
        this.soundSystem = builder.soundSystem;
    }

    // Static Builder class
    public static class Builder {
        private final String engineType; // Required
        private String color = "White"; // Default
        private boolean sunroof = false; // Default
        private boolean navigationSystem = false; // Default
        private String soundSystem = "Standard"; // Default

        public Builder(String engineType) {
            this.engineType = engineType;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder sunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Builder navigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Builder soundSystem(String soundSystem) {
            this.soundSystem = soundSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType='" + engineType + '\'' +
                ", color='" + color + '\'' +
                ", sunroof=" + sunroof +
                ", navigationSystem=" + navigationSystem +
                ", soundSystem='" + soundSystem + '\'' +
                '}';
    }
}

