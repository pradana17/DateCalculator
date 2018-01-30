/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datecalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dony pradana
 */
public class DateComparatorTest {
    
    public DateComparatorTest() {
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
     * Test of selisihHari method, of class DateComparator.
     */
    @Test
    public void testSelisihHari2() throws Exception {
        System.out.println("selisihHari");
        String date1 = "28-2-2014";
        String date2 = "11-1-2015";
        String expResult = "317";
        String result = DateComparator.selisihHari(date1, date2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSelisihHari1() throws Exception {
        System.out.println("selisihHari");
        String date1 = "28-2-2016";
        String date2 = "11-1-2015";
        String expResult = "-1";
        String result = DateComparator.selisihHari(date1, date2);
        assertEquals(expResult, result);
    }
    
}
