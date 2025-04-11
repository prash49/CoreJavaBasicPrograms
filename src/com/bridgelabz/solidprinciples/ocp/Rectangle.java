package com.bridgelabz.solidprinciples.ocp;

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { this.length = l; this.width = w; }
    double area() { return length * width; }
}