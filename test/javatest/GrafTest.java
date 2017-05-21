/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acer
 */
public class GrafTest {
    
    public GrafTest() {
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
     * Test of add_mas method, of class Graf.
     */
    @Test
    public void testAdd_mas() {
        System.out.println("add_mas");
        List A = null;
        Graf instance;
        instance= new Graf(1);
        int expResult = 1;
        int result = instance.add_mas(A);
        assertEquals(expResult, result);
        if(expResult != result)// TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add_matrix method, of class Graf.
     */
    @Test
    public void testAdd_matrix() {
        System.out.println("add_matrix");
        List A = null;
        List B = null;
        Graf instance = new Graf(2);
        int expResult = 1;
        int result = instance.add_matrix(A, B);
        assertEquals(expResult, result);
        if(expResult != result)// TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class Graf.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        List Head = null;
        int c = 0;
        Graf instance = new Graf(1);
        List expResult = null;
        List result = instance.search(Head, c);
        assertEquals(expResult, result);
        if(expResult != result)// TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Nul_flag method, of class Graf.
     */
    @Test
    public void testNul_flag() {
        System.out.println("Nul_flag");
        Graf instance = new Graf(1);
        instance.Nul_flag();
            if( 0 != 0 ){// TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }
}
