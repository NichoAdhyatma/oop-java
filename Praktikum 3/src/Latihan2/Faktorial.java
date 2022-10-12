package Latihan2;

public class Faktorial {
    private int result = 1;

    public Faktorial(int iteration) {
        for (int i = 1; i <= iteration; i++) {
            countFaktorial(i);
            printResult(i);
            result = 1;
        }
    }

    public void countFaktorial(int value) {
        while (value > 1) {
            result = result * value * (value - 1);
            value -= 2;
        }
    }

    public void printResult(int value) {
        System.out.println(value + " => " + result);
    }
}