package Latihan;

import java.text.NumberFormat;

public class ShapeTester {
    public static void main(String[] args) {
        Shape kubus = new Shape(5, 5, 5);
        Shape balok = new Shape(10, 5, 5);
        NumberFormat digit = NumberFormat.getInstance();
        digit.setMaximumFractionDigits(0);

        kubus.cetak();
        balok.cetak();
        double selisihVolume = kubus.compareTo(balok);
        System.out.println("Selisih Volume = " + digit.format(selisihVolume));
    }
}