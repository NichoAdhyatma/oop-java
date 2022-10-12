package Latihan1;

public class Average{
    public int nrp;
    public int[] nilaiTotal;
    public double Avg;

    public Average(int nrp, int[] nilaiTotal) {
        this.nrp = nrp;
        this.nilaiTotal = nilaiTotal;
    }

    public void countAvg() {
        Avg = (double)(nilaiTotal[0] + nilaiTotal[1] + nilaiTotal[2]) / nilaiTotal.length;
    }
    public int getNrp() {
        return nrp;
    }

    public double getAvg() {
        countAvg();
        return Avg;
    }
}