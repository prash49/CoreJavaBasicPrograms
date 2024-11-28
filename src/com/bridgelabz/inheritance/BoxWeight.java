package com.bridgelabz.inheritance;

public class BoxWeight extends  Box{
    Double weight;

    public BoxWeight(){
        this.weight = (double) -1;
    }

    public BoxWeight(Double length, Double height, Double width, Double weight){
        super(length, width, height);// super keyword refers to its parent class in here its referring to Box class constructor
        this.weight = weight;
    }
}
