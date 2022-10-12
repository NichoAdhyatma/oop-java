package Tugas1;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Kalimat : ");
        String str1 = input.nextLine();
        System.out.println("Huruf yang ingin dicari ? ");
        char search = input.next().charAt(0);

        findIndex(str1, search);
    }

    public static void findIndex(String str, char search) {
        int i = str.indexOf(search);
        StringBuilder result = new StringBuilder();

        System.out.print("Karakter " + search + " ditemukan pada index : ");
        while (i != -1) {
            result.append(i).append(", ");
            i = str.indexOf(search, i + 1);
        }
        result = new StringBuilder(result.substring(0, result.length()-2));
        System.out.print(result);
    }
}