package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void app(int a, int b) {
        assertEquals(6, App.add(3, 3));
        assertTrue(App.mul(3, 3) > 0);
        assertEquals(1, App.div(3, 3));
        assertEquals(0, App.sub(3, 3));
    }
    

    
}