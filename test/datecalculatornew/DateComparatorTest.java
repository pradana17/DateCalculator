/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datecalculatornew;

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
    DateComparator dc = new DateComparator();
    MyDate md;
    
    @Test
    public void testSelisihHari2() throws Exception {
        System.out.println("selisihHari");
        String expResult = "317";
        String result = dc.selisihHari(md=new MyDate(28, 2, 2014), md=new MyDate(11, 1, 2015));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSelisihHari1() throws Exception {
        System.out.println("selisihHari");
        String expResult = "-1";
        String result = dc.selisihHari(md=new MyDate(28, 2, 2016), md=new MyDate(11, 1, 2015));
        assertEquals(expResult, result);
     }

    /**
     * Test of validasiTahun method, of class DateComparator.
     */
    @Test
    public void testValidasiTahun() throws Exception {
        System.out.println("validasiTahun");
        assertTrue(dc.validasiTahun(1995));
    }

    /**
     * Test of validasiTahun method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiTahunFalse() throws Exception {
        System.out.println("validasiTahunFalse");
        assertTrue(dc.validasiTahun(1960));
    }
    /**
     * Test of validasiTahun method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiTahunFalse2() throws Exception {
        System.out.println("validasiTahunFalse2");
        assertTrue(dc.validasiTahun(1200));
    }

    
    /**
     * Test of validasiBulan method, of class MyDate.
     */
    @Test
    public void testValidasiBulan() throws Exception {
        System.out.println("validasiBulan");
        assertTrue(dc.validasiBulan(2));
    }
    
        /**
     * Test of validasiBulan method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiBulanFalse() throws Exception {
        System.out.println("validasiBulanFalse");
        assertFalse(dc.validasiBulan(13));
    }
    
       /**
     * Test of validasiBulan method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiBulanFalse2() throws Exception {
        System.out.println("validasiBulanFalse2");
        assertFalse(dc.validasiBulan(0));
    }
    /**
     * Test of validasiTanggal method, of class MyDate.
     */
    @Test
    public void testValidasiTanggal() throws Exception {
        System.out.println("validasiTanggal");
        assertTrue(dc.validasiTanggal(12,2,2000));
    }
    
    /**
     * Test of validasiTanggal method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiTanggalFalse() throws Exception {
        System.out.println("validasiTanggalFalse");
        assertTrue(dc.validasiTanggal(29,2,2001));
    }
    
    /**
     * Test of validasiTanggal method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiTanggalFalse2() throws Exception {
        System.out.println("validasiTanggalFalse2");
        assertTrue(dc.validasiTanggal(31,4,2010));
    }
    
}
