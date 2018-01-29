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
//
//    protected static String selisihHari(Date tanggalsatu, Date tanggaldua) {
//        long selisih1 = Math.abs(tanggaldua.getTime() - tanggalsatu.getTime());
//        String selisih = selisih1 / (24 * 60 * 60 * 1000) + " hari";
//        return selisih;
//    }

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
