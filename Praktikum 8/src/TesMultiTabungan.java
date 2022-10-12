import Tugas.MultiTabungan;

import java.util.Scanner;

public class TesMultiTabungan {
    public static void main(String[] args) {
        MultiTabungan tabungan = new MultiTabungan(10000);
        int jumlah;
        Scanner input = new Scanner(System.in);
        System.out.println("Berhasil! Anda membuat tabungan baru saldo awal anda : Rp. " + tabungan.getSaldo());


        System.out.print("Menabung Uang dalam AUD : ");
        jumlah = input.nextInt();
        tabungan.simpanUang(jumlah);
        System.out.println("Sukses menambahkan  " + jumlah + " AUD ! Saldo anda sekarang : Rp. " + tabungan.getSaldo());

        System.out.print("Mengambil Uang dalam IDR : ");
        jumlah = input.nextInt();
        if(tabungan.ambilUang(jumlah)) {
            System.out.println("Sukses mengambil uang ! \nsisa saldo : Rp. " + tabungan.getSaldo());
        }else System.out.println("Gagal ! Saldo tidak mencukupi ");

        System.out.print("Mengambil Uang dalam USD : ");
        jumlah = input.nextInt();
        if(tabungan.ambilUang(jumlah)) {
            System.out.println("Sukses mengambil uang !  \nsisa saldo : Rp. " + tabungan.getSaldo());
        }else System.out.println("Gagal mengambil uang ! Saldo tidak mencukupi");
    }
}