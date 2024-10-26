package com.bridgelabz;

import java.util.Comparator;


public class Bycycle{
    public String getBrand() {
        return brand;
    }

    public Bycycle() {
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    private  int frameSize;

    Bycycle(String brand, int frameSize){
        this.brand = brand;
        this.frameSize = frameSize;
    }

    public  void printBrand(String brand){
        System.out.println("Brand is :: "+ brand);
    }

}

