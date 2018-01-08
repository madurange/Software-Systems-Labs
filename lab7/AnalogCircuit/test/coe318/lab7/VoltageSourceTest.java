/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author uSER
 */
public class VoltageSourceTest {
    
    public VoltageSourceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class VoltageSource.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        VoltageSource instance = new VoltageSource(4.5, new Node(3), new Node(1));
        String expResult = "V1\tNodes: 3 & 1\tDC\t4.5 V";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
