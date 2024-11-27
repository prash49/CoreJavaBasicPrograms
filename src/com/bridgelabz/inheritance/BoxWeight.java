package com.bridgelabz.inheritance;

public class BoxWeight extends  Box{
    Double weight;

    public BoxWeight(){
        this.weight = (double) -1;
    }

    public BoxWeight(Double length, Double height, Double width, Double weight){

        super(length, width, height);
        this.weight = weight;
    }
}
