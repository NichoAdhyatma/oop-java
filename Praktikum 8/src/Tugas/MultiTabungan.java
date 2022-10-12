package Tugas;

import java.util.Scanner;

public class MultiTabungan {
    private int saldo;
    private int mataUang;
    Scanner input = new Scanner(System.in);

    public MultiTabungan(int initsaldo) {
        this.saldo = konversi(initsaldo);
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah) {
        saldo += konversi(jumlah);
    }

    public boolean ambilUang(int jumlah) {
        int nJumlah = konversi(jumlah);
        if (saldo >= nJumlah) {
            saldo -= nJumlah;
            return true;
        }
        return false;
    }

    public int pilihMataUang() {
        System.out.println("Pilih Mata Uang Anda : \n1. AUD\n2. USD\n3. IDR");
        System.out.print("Pilihan Anda : ");
        return mataUang = input.nextInt();
    }

    public int konversi(int jumlah) {
        pilihMataUang();

        return switch (mataUang) {
            case 1 -> audToIdr(jumlah);
            case 2 -> usdToIdr(jumlah);
            default -> jumlah;
        };
    }

    public int audToIdr(int jumlah) {
        return jumlah * 10000;
    }

    public int usdToIdr(int jumlah) {
        return jumlah * 9000;
    }
}