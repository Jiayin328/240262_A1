/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carynne
 */
public class Asg1Test {
    
    public Asg1Test() {
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
     * Test of listFiles method, of class Asg1.
     */
    @Test
    public void testListFiles() {
        System.out.println("listFiles");
        String path = System.getProperty("user.dir");
        Asg1.listFiles(path);
    }

    /**
     * Test of listIssues method, of class Asg1.
     * @throws java.lang.Exception
     */
    @Test
    public void testListIssues() throws Exception {
        System.out.println("listIssues");
        Asg1.listIssues();
    }
    
}
