
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        replace(str);
    }

    public static void replace(String str) {
        String lastChar = str.substring(str.length() - 1);
        String firstChar = str.substring(0, 1);

        System.out.println("first char : " + firstChar);
        System.out.println("last char : " + lastChar);


        str = str.replaceAll("(?i)" + firstChar, lastChar);

        String replaceLastChar = str.substring(0, str.length() - 1);
        str = replaceLastChar + firstChar;

        System.out.println(str);
    }
}