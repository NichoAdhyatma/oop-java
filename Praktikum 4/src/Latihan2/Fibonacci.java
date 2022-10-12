package Latihan2;

public class Fibonacci {
    public int jumlah;
    int[] fibonacci;

    public Fibonacci(int jumlah) {
        this.jumlah = jumlah;
        fibonacci = new int[jumlah];
        fibonacci[0] = 0;
    }

    public void countFibonacci() {
        for(int i = 1; i < fibonacci.length; i++) {
            if(i == 1) fibonacci[i] = 1;
            else {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }
    }

    public int[] getFibonacci() {
        countFibonacci();
        return fibonacci;
    }
}