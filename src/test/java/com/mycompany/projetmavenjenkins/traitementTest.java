/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetmavenjenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usager
 */
public class traitementTest {
    
    public traitementTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addition method, of class traitement.
     */
    @org.junit.Test
    public void testAddition() {
        System.out.println("addition");
        int valeur = 10;
        traitement instance = new traitement();
        double expResult = 500;
        double result = instance.addition(valeur);
        assertEquals(expResult, result, 0.0);
    }
    
}
