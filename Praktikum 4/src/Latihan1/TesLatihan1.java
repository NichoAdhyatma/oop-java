package Latihan1;

import java.text.NumberFormat;

public class TesLatihan1 {
    public static void main(String[] args) {
        int[][] nilaiSiswa = {{81, 90, 62}, {50, 83, 87}, {89, 55, 65}, {77, 70, 92}};
        int[] nrp = {1, 2, 3, 4};

        Average[] Average = {new Average(nrp[0], nilaiSiswa[0]),
                                new Average(nrp[1], nilaiSiswa[1]),
                                new Average(nrp[2], nilaiSiswa[2]),
                                new Average(nrp[3], nilaiSiswa[3])
                            };

        NumberFormat num = NumberFormat.getInstance();
        num.setMaximumFractionDigits(2);

        System.out.println("NRP\tRata-rata\n-----------");
        for (Average avg : Average) {
            System.out.print(avg.getNrp() + "\t");
            System.out.println(num.format(avg.getAvg()));
        }
        System.out.println("-----------");
    }

}