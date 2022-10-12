package Tugas5;

import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String replace = input.nextLine();

        replaceStr(str1, str2, replace);

    }

    public static void replaceStr(String str1, String str2, String replace) {
        str1 = str1.replace(str2, replace);

        System.out.println(str1);
    }
}