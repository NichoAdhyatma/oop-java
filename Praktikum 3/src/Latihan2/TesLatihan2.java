package Latihan2;

import java.util.Scanner;

public class TesLatihan2 {
    public static void  main(String[] args)  {
        int param = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan bilangan faktorial : ");

        param = scan.nextInt();
        scan.close();

        new Faktorial(param);
    }
}