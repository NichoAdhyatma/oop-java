package Tugas1;

public class Fibonacci {
    private int prev, next;
    private final int jumlah;

    public Fibonacci(int i) {
        prev = 0;
        next = 1;
        jumlah = i;
        hitungFibonacci();
    }

    public void hitungFibonacci() {
        for(int i = 0; i < jumlah; i++) {
            printDeret( next ); // 1, 1, 2, 3,
            next += prev;
            prev = next - prev;
        }
    }

    public void printDeret(int value) {
        System.out.print( value + " " );
    }
}