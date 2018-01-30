/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datecalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author dony pradana
 */
public class MyDate {

    private int Tanggal;
    private int Bulan;
    private int Tahun;

    public MyDate(int tanggal, int bulan, int tahun) {
        this.Tanggal = tanggal;
        this.Bulan = bulan;
        this.Tahun = tahun;
    }

    /**
     * method yang digunakan untuk memvalidasi Tahun
     * @param tahun parameter input dengan nilai berupa integer
     * @return boolean true apabila inputan tahun bernilai >1970 dan apabila inputan angka <=1970 maka terjadi exception
     * @throws CustomException 
     */
    static boolean validasiTahun(int tahun) throws CustomException {
        if (tahun <= 1970) {
            JOptionPane.showMessageDialog(null, "Tahun " + tahun + " salah", "ERROR", JOptionPane.ERROR_MESSAGE);
            throw new CustomException("Tahun yang dimasukkan salah");
        }
        return true;
    }

    /**
     * Method yang digunakan untuk mevalidasi Bulan
     * @param bulan parameter input berupa integer
     * @return boolean true apabila nilai inputan diantara 1-12 dan akan menghasilkan exception apabila inputan <1 atau >12
     * @throws CustomException 
     */
    static boolean validasiBulan(int bulan) throws CustomException {
        if (bulan < 1 || bulan > 12) {
            JOptionPane.showMessageDialog(null, "Bulan " + bulan + " salah", "ERROR", JOptionPane.ERROR_MESSAGE);
            throw new CustomException("Bulan yang dimasukkan salah");
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(Tanggal);
        builder.append("-");
        builder.append(Bulan);
        builder.append("-");
        builder.append(Tahun);
        return builder.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * method yang digunakan untuk memvalidasi tanggal
     * @param abs merupakan object dari MyDate
     * @return menghasilkan true apabila nilai tanggal sesuai dengan bulannya dan tahunnya
     * @throws CustomException 
     */
    static boolean validasiTanggal(MyDate abs) throws CustomException {
        if (validasiBulan(abs.Bulan) && validasiTahun(abs.Tahun)) {
            switch (abs.Bulan) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (abs.Tanggal >= 1 && abs.Tanggal <= 31) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tanggal " + abs.Tanggal + " salah", "ERROR", JOptionPane.ERROR_MESSAGE);
                        throw new CustomException("Tanggal yang dimasukkan salah");
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    if (abs.Tanggal >= 1 && abs.Tanggal <= 30) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Tanggal " + abs.Tanggal + " salah", "ERROR", JOptionPane.ERROR_MESSAGE);
                        throw new CustomException("Tanggal yang dimasukkan salah");
                    }
                case 2:
                    if (abs.Tahun % 4 == 0) {
                        if (abs.Tanggal >= 1 && abs.Tanggal <= 29) {
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Tanggal " + abs.Tanggal + " salah", "ERROR", JOptionPane.ERROR_MESSAGE);
                            throw new CustomException("Tanggal yang dimasukkan salah");
                        }
                    } else if (abs.Tahun % 4 != 0) {
                        if (abs.Tanggal >= 1 && abs.Tanggal <= 28) {
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Tanggal " + abs.Tanggal + " salah", "ERROR", JOptionPane.ERROR_MESSAGE);
                            throw new CustomException("Tanggal yang dimasukkan salah");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tanggal " + abs.Tanggal + " salah", "ERROR", JOptionPane.ERROR_MESSAGE);
                        throw new CustomException("Tanggal yang dimasukkan salah");
                    }
                default:
                    JOptionPane.showMessageDialog(null, "Tanggal " + abs.Tanggal + " salah", "ERROR", JOptionPane.ERROR_MESSAGE);
                    throw new CustomException("Tanggal yang dimasukkan salah");
            }

        }
        JOptionPane.showMessageDialog(null, "Inputan salah", "ERROR", JOptionPane.ERROR_MESSAGE);
        throw new CustomException("Inputan Salah");
    }

    /**
     * @return the Tanggal
     */
    public int getTanggal() {
        return Tanggal;
    }

    /**
     * @param Tanggal the Tanggal to set
     */
    public void setTanggal(int Tanggal) {
        this.Tanggal = Tanggal;
    }

    /**
     * @return the Bulan
     */
    public int getBulan() {
        return Bulan;
    }

    /**
     * @param Bulan the Bulan to set
     */
    public void setBulan(int Bulan) {
        this.Bulan = Bulan;
    }

    /**
     * @return the Tahun
     */
    public int getTahun() {
        return Tahun;
    }

    /**
     * @param Tahun the Tahun to set
     */
    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }

}
