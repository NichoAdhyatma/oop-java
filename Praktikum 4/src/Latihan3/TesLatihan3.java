package Latihan3;
import java.util.Scanner;

public class TesLatihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan : ");
        int angka = input.nextInt();
        input.close();

        Prima bilangan = new Prima(angka);
        if(bilangan.cekPrima()) System.out.println(angka + " bilangan prima");
        else System.out.println(angka + " bukan bilangan prima");
    }
}