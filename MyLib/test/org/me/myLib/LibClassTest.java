/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.myLib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Toshiba
 */
public class LibClassTest {

    public LibClassTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of acrostic method, of class LibClass.
     */
    @Test
    public void testAcrostic() {
       System.err.println("Running testAcrostic...");
String result = LibClass.acrostic(new String[]
                  {"fnord", "polly", "tropism"});
                assertEquals("Correct value", "foo", result);
    }

}