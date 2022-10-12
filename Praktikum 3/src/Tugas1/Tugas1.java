package Tugas1;

import java.util.Scanner;

public class Tugas1 {
    public static void main( String[] args ) {
        int jumlah, prev = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan berapa deret fibonacci ? ");

        jumlah = scan.nextInt();

        new Fibonacci(jumlah);
    }
}