package com.shape;

import com.shape.domain.Tetrahedron;
import org.junit.Assert;
import org.junit.Test;

public class TetrahedronTest {

    @Test
    public void testTetrahedron_Edge_1(){
        Tetrahedron tetrahedron = new Tetrahedron(1.0);
        double volume = tetrahedron.calculateVolume();
        Assert.assertEquals( 0.12, volume, 0.0);
    }

    @Test
    public void testTetrahedron_Edge_5(){
        Tetrahedron tetrahedron = new Tetrahedron(5.0);
        double volume = tetrahedron.calculateVolume();
        Assert.assertEquals( 14.73, volume, 0.0);
    }
}
