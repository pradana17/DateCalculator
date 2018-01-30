/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datecalculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dony pradana
 */
public class DateComparator {

    /**
     * Method yang digunakan untuk menghitung selisih hari antara dua tanggal yang di inputkan
     * @param date1 inputan berupa nilai string tanggal awal dd-mm-yyyy yang nantinya akan diubah type data menjadi date 
     * @param date2 inputan berupa nilai string tanggal akhir dd-mm-yyyy yang nantinya akan diubah type data menjadi date 
     * @return akan menghasilkan nilai selisih antara 2 tanggal yang berupa string, apabila tanggal awal > tanggal akhir maka akan menghasilkan "-1", apabila tanggal awal<tanggal akhir maka akan menghasilkan string selisih hari
     * @throws ParseException 
     */
    public static String selisihHari(String date1, String date2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date tglawal = sdf.parse(date1);
        Date tglakhir = sdf.parse(date2);
        if (tglawal.getTime() < tglakhir.getTime()) {
            String selisih = ((Math.abs(tglakhir.getTime() - tglawal.getTime())) / (24 * 60 * 60 * 1000)) + "";
            return selisih;
        } else if (tglawal.getTime() > tglakhir.getTime()) {
            return "-1";
        }
        return "ERROR";
    }

}
