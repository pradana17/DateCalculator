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
public class MyDateTest {
    
    public MyDateTest() {
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
     * Test of validasiTahun method, of class MyDate.
     */
    @Test
    public void testValidasiTahun() throws Exception {
        System.out.println("validasiTahun");
        assertTrue(MyDate.validasiTahun(1995));
    }
        /**
     * Test of validasiTahun method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiTahunFalse() throws Exception {
        System.out.println("validasiTahunFalse");
        assertTrue(MyDate.validasiTahun(1960));
    }
            /**
     * Test of validasiTahun method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiTahunFalse2() throws Exception {
        System.out.println("validasiTahunFalse2");
        assertTrue(MyDate.validasiTahun(1200));
    }

    /**
     * Test of validasiBulan method, of class MyDate.
     */
    @Test
    public void testValidasiBulan() throws Exception {
        System.out.println("validasiBulan");
        int bulan = 2;
        assertTrue(MyDate.validasiBulan(bulan));
    }
    
        /**
     * Test of validasiBulan method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiBulanFalse() throws Exception {
        System.out.println("validasiBulanFalse");
        int bulan = 13;
        assertFalse(MyDate.validasiBulan(bulan));
    }
    
       /**
     * Test of validasiBulan method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiBulanFalse2() throws Exception {
        System.out.println("validasiBulanFalse2");
        int bulan = 0;
        assertFalse(MyDate.validasiBulan(bulan));
    }

    /**
     * Test of validasiTanggal method, of class MyDate.
     */
    @Test
    public void testValidasiTanggal() throws Exception {
        System.out.println("validasiTanggal");
        MyDate abs = new MyDate(12, 2, 2000);
        assertTrue(MyDate.validasiTanggal(abs));
    }
    
    /**
     * Test of validasiTanggal method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiTanggalFalse() throws Exception {
        System.out.println("validasiTanggalFalse");
        MyDate abs = new MyDate(29, 2, 2001);
        assertTrue(MyDate.validasiTanggal(abs));
    }
    
    /**
     * Test of validasiTanggal method, of class MyDate.
     */
    @Test(expected = CustomException.class)
    public void testValidasiTanggalFalse2() throws Exception {
        System.out.println("validasiTanggalFalse2");
        MyDate abs = new MyDate(31, 4, 2010);
        assertTrue(MyDate.validasiTanggal(abs));
    }
}
