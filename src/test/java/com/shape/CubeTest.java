package com.shape;

import com.shape.domain.Cube;
import org.junit.Assert;
import org.junit.Test;

public class CubeTest {

    @Test
    public void testCube_Width_1(){
        Cube cube = new Cube(1.0);
        double volume = cube.calculateVolume();
        Assert.assertEquals( 1, volume, 0.0);
    }

    @Test
    public void testCube_Width_5(){
        Cube cube = new Cube(5.0);
        double volume = cube.calculateVolume();
        Assert.assertEquals( 125, volume, 0.0);
    }
}
