package com.shape;

import com.shape.domain.Cube;
import com.shape.domain.Sphere;
import com.shape.domain.Tetrahedron;

public class Application {

    public static void main(String[] args){
        // Sphere of radius 1.0
        Sphere sphere = new Sphere(1.0);
        System.out.println("Sphere of radius 1.0, volume: " + sphere.calculateVolume());

        // sphere radius 5.0
        Sphere sphere2 = new Sphere(5.0);
        System.out.println("Sphere of radius 5.0, volume: " + sphere2.calculateVolume());

        // Cube with side 1.0
        Cube cube = new Cube(1.0);
        System.out.println("Cube of side length 1.0, volume: " + cube.calculateVolume());

        // Cube of side length 5.0
        Cube cube2 = new Cube(5.0);
        System.out.println("Cube of side length 5.0, volume: " + cube2.calculateVolume());

        // Tetrahedron of edge 1.0
        Tetrahedron tetrahedron = new Tetrahedron(1.0);
        System.out.println("Tetrahedron of side 1.0, volume is: " + tetrahedron.calculateVolume());

        // Tetrahedron of edge 5.0
        Tetrahedron tetrahedron2 = new Tetrahedron(5.0);
        System.out.println("Tetrahedron of side 5.0, volume is: " + tetrahedron2.calculateVolume());
    }
}
