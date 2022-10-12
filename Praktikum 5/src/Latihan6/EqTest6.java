package Latihan6;

public class EqTest6{
    public static void main(String[] argv){
        String str = new String("Java");
        String buffer = new String("Java");

        if(str.equals(buffer)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
}