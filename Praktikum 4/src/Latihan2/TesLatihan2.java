package Latihan2;

import java.util.Scanner;
public class TesLatihan2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int i;
        int bil;
        boolean prima = true;
        System.out.print("Masukkan bilangan? ");
        bil = input.nextInt();
        if(bil < 2)
            prima = false;
        else{
            for(i = 2; i < bil; i++){
                if(bil % i == 0){
                    prima = false;
                    break;
                }
            }
        }
        if(prima)
            System.out.println(bil + " adalah bilangan prima");
        else
            System.out.println(bil + " bukan termasuk bilangan prima");
    }
}