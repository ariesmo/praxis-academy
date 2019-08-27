package Bicycle;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Bicycle.MountainBike;

public class MountainBikeTest {

    private static MountainBike mount = new MountainBike(0, 10, 20, 30); 
    
    @Test
    public void testCadence(){
        assertEquals(10, mount.getCadence());
        
    }

    @Test
    public void testGear(){
        assertEquals(30, mount.getGear());
        
    }

    @Test
    public void testSpeed(){
        assertEquals(20, mount.getSpeed());
        
    }

}