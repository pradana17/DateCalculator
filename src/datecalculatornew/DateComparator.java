/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datecalculatornew;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author dony pradana
 */
public class DateComparator {
    
    /**
     * Method yang digunakan untuk menghitung selisih hari antara dua tanggal
     * @param my1 dari kelas MyDate yang merupakan tanggal awal
     * @param my2 dari kelas MyDate yang merupakan tanggal akhir
     * @return string yang merupakan hasil selisih dari pengurangan tanggal akhir dengan tanggal awal, apabila tanggal awal lebih>tanggal akhir maka akan return "-1" dan apabila tanggal awal<tanggal akhir akan mengembalikan nilai string selisih dari dua tanggal.
     * @throws ParseException 
     */
    public String selisihHari(MyDate my1, MyDate my2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date tglawal = sdf.parse(my1.toString());
        Date tglakhir = sdf.parse(my2.toString());
        if (tglawal.getTime() < tglakhir.getTime()) {
            String selisih = ((Math.abs(tglakhir.getTime() - tglawal.getTime())) / (24 * 60 * 60 * 1000)) + "";
            return selisih;
        } else if (tglawal.getTime() > tglakhir.getTime()) {
            return "-1";
        }
        return "ERROR";
    }

    /**
     * Method yang digunakan untuk melakukan validasi tahun
     * @param t bertipe integer
     * @return boolean true apabila nilai t bernilai >=1970, dan akan melakukan exception apabila t < 1970
     * @throws CustomException 
     */
    public boolean validasiTahun(int t) throws CustomException {
        if (t < 1970) {
            JOptionPane.showMessageDialog(null, "Tahun " + t + " kurang dari 1970", "ERROR", JOptionPane.ERROR_MESSAGE);
            throw new CustomException("Tahun " + t + " Salah");
        }
        return true;
    }

    /**
     * Method yang digunakan untuk melakukan validasi bulan
     * @param b bertipe integer
     * @return boolean true apabila nilai b diantara 1-12 dan akan melakukan exception apabila nilai <1 atau >12
     * @throws CustomException 
     */
    public boolean validasiBulan(int b) throws CustomException {
        if (b < 1 || b > 12) {
            JOptionPane.showMessageDialog(null, "Bulan " + b + " salah", "ERROR", JOptionPane.ERROR_MESSAGE);
            throw new CustomException("Bulan " + b + " Salah");
        }
        return true;
    }

    /**
     * Method yang digunakan untuk melakukan validasi tanggal
     * @param t bertipe integer untuk mewakili tanggal
     * @param b bertipe integer untuk mewakili bulan
     * @param th bertipe integer untuk mewakili tahun
     * @return boolean true apabila validasi bulan true, validasi tahun true dan tanggal sesuai dengan penanggalan di bulan dan akan melakukan exception apabila nilai tanggal tidak sesuai
     * @throws CustomException 
     */
    public boolean validasiTanggal(int t, int b, int th) throws CustomException {
        if (validasiBulan(b) && validasiTahun(th)) {
            switch (b) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (t >= 1 && t <= 31) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tanggal " + t + " antara 1 - 31", "ERROR", JOptionPane.ERROR_MESSAGE);
                        throw new CustomException("Tanggal yang dimasukkan salah");
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    if (t >= 1 && t <= 30) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tanggal " + t + " antara 1 - 30", "ERROR", JOptionPane.ERROR_MESSAGE);
                        throw new CustomException("Tanggal yang dimasukkan salah");
                    }
                case 2:
                    if (th % 4 == 0) {
                        if (t >= 1 && t <= 29) {
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Tanggal " + t + " antara 1 - 29", "ERROR", JOptionPane.ERROR_MESSAGE);
                            throw new CustomException("Tanggal yang dimasukkan salah");
                        }
                    } else if (th % 4 != 0) {
                        if (t >= 1 && t <= 28) {
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Tanggal " + t + " antara 1 - 28", "ERROR", JOptionPane.ERROR_MESSAGE);
                            throw new CustomException("Tanggal yang dimasukkan salah");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tanggal " + t + " salah", "ERROR", JOptionPane.ERROR_MESSAGE);
                        throw new CustomException("Tanggal yang dimasukkan salah");
                    }
                default:
                    JOptionPane.showMessageDialog(null, "Tanggal " + t + " salah", "ERROR", JOptionPane.ERROR_MESSAGE);
                    throw new CustomException("Tanggal yang dimasukkan salah");

            }
        }
        JOptionPane.showMessageDialog(null, "Inputan Salah", "ERROR", JOptionPane.ERROR_MESSAGE);
        throw new CustomException("Inputan Salah");
    }
}
