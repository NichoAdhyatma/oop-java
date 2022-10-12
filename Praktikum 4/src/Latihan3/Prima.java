package Latihan3;

public class Prima {
    public int bilangan;

    public Prima(int bilangan) {
        this.bilangan = bilangan;
    }

    public  boolean cekPrima() {
        int cek = 0;
        if(bilangan == 1 ) return false;
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) cek++;
        }
        return (cek < 3);
    }

    public static void hello() {
        System.out.println("hello");
    }
}