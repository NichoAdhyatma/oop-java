package Tugas4;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.nextLine();
        String str2 = input.nextLine();
        tukerString(str1, str2);
    }

    public static void tukerString(String str1, String str2) {
        String tempStr1 = str1.substring(str1.lastIndexOf(" ") + 1);
        String tempStr2 = str2.substring(str2.lastIndexOf(" ") + 1);

        str1 = str1.substring(0, str1.lastIndexOf(" ") + 1) + tempStr2;
        str2 = str2.substring(0, str2.lastIndexOf(" ") + 1) + tempStr1;

        System.out.println(str1);
        System.out.println(str2);
    }
}