/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vektorrechnung;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author s.hoenes
 */
public class VektorTest {
    
    public VektorTest() {
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
     * Test of plus method, of class Vektor.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        Vektor that = new Vektor(1,2,3);
        Vektor instance = new Vektor(2,3,4);
        Vektor expResult = new Vektor(3.0,5.0,7.0);
        Vektor result = instance.plus(that);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of minus method, of class Vektor.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        Vektor that = new Vektor(3,4,5);
        Vektor instance = new Vektor(2,3,4);
        Vektor expResult = new Vektor(-1.0, -1.0, -1.0);
        Vektor result = instance.minus(that);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of skalar method, of class Vektor.
     */
    @Test
    public void testSkalar() {
        System.out.println("skalar");
        Vektor that = new Vektor(1,2,3);
        Vektor instance = new Vektor(2,4,5);
        double expResult = 25.0;
        double result = instance.skalar(that);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of kreuz method, of class Vektor.
     */
    @Test
    public void testKreuz() {
        System.out.println("kreuz");
        Vektor that = new Vektor(1.0,2.0,3.0);
        Vektor instance = new Vektor(2.0,4.0,5.0);
        Vektor expResult = new Vektor(2.0,-1.0,0.0);
        Vektor result = instance.kreuz(that);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of quersumme method, of class Vektor.
     */
    @Test
    public void testQuersumme() {
        System.out.println("quersumme");
        Vektor instance = new Vektor (1,2,3);
        double expResult = 6.0;
        double result = instance.quersumme();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Vektor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vektor instance = new Vektor (1,2,3);
        String expResult = "(1.0,2.0,3.0)";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
