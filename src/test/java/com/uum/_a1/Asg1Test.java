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
        String path = "E:\\Online Learning\\Sem 5\\STIW3054 Real-Time Programming";
        Asg1.listFiles(path);
        
    }

    /**
     * Test of listIssues method, of class Asg1.
     */
    @Test
    public void testListIssues() throws Exception {
        System.out.println("listIssues");
        String path = "";
        Asg1.listIssues(path);
       
    }

    
}
