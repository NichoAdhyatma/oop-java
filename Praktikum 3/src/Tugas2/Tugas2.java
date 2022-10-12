package Tugas2;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan tahun 1900 - 2005 : ");

        int tahun = scan.nextInt();

        new Kabisat(tahun);
    }
}