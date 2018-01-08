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
public class CircuitElementTest {
    
    public CircuitElementTest() {
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
     * Test of getNodes method, of class CircuitElement.
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
        Node n1=new Node(1);
        Node n2=new Node(3);
        CircuitElement instance = new Resistor(5.5,n1,n2);
        Node[] expResult = {n1,n2};
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result);

    }

    public class CircuitElementImpl extends CircuitElement {

        public CircuitElementImpl() {
            super(null, null);
        }
    }
    
}
