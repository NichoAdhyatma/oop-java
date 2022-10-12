package Tugas2;

public class CountEl {
    public static void main(String[] args) {
        char[] matKul = {'p', 'e', 'm', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'n', 'b', 'e', 'r', 'b', 'a', 's', 'i', 's', 'o', 'b', 'y', 'e', 'k'};
        int count = 0;

        for (char c : matKul) {
            if (c == 'a') count++;
        }

        System.out.println(count);
    }


}