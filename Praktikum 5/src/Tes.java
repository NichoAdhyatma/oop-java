import java.util.Scanner;

public class Tes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String str = in.nextLine();
        in.close();
        char[] arr = str.toCharArray();
        int temp = arr[0] + 32;
        int temp2 = arr[str.length() - 1] - 32;
        arr[0] = (char) temp2;
        arr[str.length() - 1] = (char) temp;
        String str2 = new String(arr);
        System.out.println("Nama Akhir : " + str2);
    }
}