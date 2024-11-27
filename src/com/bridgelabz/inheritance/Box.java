package com.bridgelabz.inheritance;

public class Box {
    Double l;
    Double w;
    Double h;

    Box(Double length, Double width, Double height) {
        this.h = height;
        this.l = length;
        this.w = width;
    }

    Box() {
        this.h = (double) -1;
        this.l = (double) -1;
        this.w = (double) -1;
    }

    Box(Double length) {
        this.l = length;
    }

}
