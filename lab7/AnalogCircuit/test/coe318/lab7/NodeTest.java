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
public class NodeTest {
    
    public NodeTest() {
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
     * Test of getId method, of class Node.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Node instance = new Node(5);
        int expResult = 5;
        int result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Node.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Node instance = new Node(1);
        String expResult = "1";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
