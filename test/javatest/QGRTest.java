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
public class QGRTest {
    
    public QGRTest() {
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
     * Test of ins method, of class QGR.
     */
    @Test
    public void testIns() {
        System.out.println("ins");
        List el = null;
        QGR instance = new QGR(1);
        instance.ins(el);
        if(instance.nElem != 0)// TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class QGR.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        QGR instance = new QGR(1);
        List expResult = null;
        List result = instance.remove();
        assertEquals(expResult, result);
        if(result != null)// TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class QGR.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        QGR instance = new QGR(1);
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        if(result != 0)// TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFront method, of class QGR.
     */
    @Test
    public void testGetFront() {
        System.out.println("getFront");
        QGR instance = new QGR(1);
        List expResult = null;
        List result = instance.getFront();
        assertEquals(expResult, result);
        if(expResult!=result)// TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
