package com.shape.domain;

public class Cube implements Shape {

    final private double sideLength;

    public Cube(double sideLength){
        this.sideLength = sideLength;
    }

    public double calculateVolume() {
        return this.sideLength * this.sideLength * this.sideLength;
    }
}
