package com.shape.domain;

public class Tetrahedron implements Shape{

    final private double edge;

    public Tetrahedron(double edge){
        this.edge = edge;
    }

    public double calculateVolume() {
        return Math.round((this.edge * this.edge * this.edge) / (6 * Math.sqrt(2)) * 100.0) / 100.0;
    }
}
