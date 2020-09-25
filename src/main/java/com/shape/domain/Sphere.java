package com.shape.domain;

import com.shape.constants.GlobalConstants;

public class Sphere implements Shape {

    final private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    /**
     * Volume of a Sphere = 4/3 * PI * (R^3)
     * @return
     */
    public double calculateVolume() {
        return Math.round((4.0/3.0) * GlobalConstants.PI * (this.radius * this.radius * this.radius) * 100.0) / 100.0;
    }
}
