/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datecalculatornew;

/**
 *
 * @author dony pradana
 */
public class MyDate {
    int tanggal;
    int bulan;
    int tahun;
    
    public MyDate(int t, int b, int th){
        this.tanggal=t;
        this.bulan=b;
        this.tahun=th;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(tanggal);
        builder.append("-");
        builder.append(bulan);
        builder.append("-");
        builder.append(tahun);
        return builder.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}