package com.shape;

import com.shape.domain.Sphere;
import org.junit.Assert;
import org.junit.Test;

public class SphereTest {

    @Test
    public void testSphere_Radius_1(){
        Sphere sphere = new Sphere(1.0);
        double volume = sphere.calculateVolume();
        Assert.assertEquals( 4.19, volume, 0.0);
    }

    @Test
    public void testSphere_Radius_5(){
        Sphere sphere = new Sphere(5.0);
        double volume = sphere.calculateVolume();
        Assert.assertEquals( 523.6, volume, 0.0);
    }
}
