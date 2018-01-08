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
public class UserInterfaceTest {
    
    public UserInterfaceTest() {
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
     * Test of start method, of class UserInterface.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        UserInterface instance = new UserInterfaceImpl();
        instance.start();

    }

    /**
     * Test of end method, of class UserInterface.
     */
    @Test
    public void testEnd() {
        System.out.println("end");
        UserInterface instance = new UserInterfaceImpl();
        instance.end();

    }

    /**
     * Test of spice method, of class UserInterface.
     */
    @Test
    public void testSpice() {
        System.out.println("spice");
        UserInterface instance = new UserInterfaceImpl();
        instance.spice();

    }

    public class UserInterfaceImpl implements UserInterface {

        public void start() {
        }

        public void end() {
        }

        public void spice() {
        }
    }
    
}
