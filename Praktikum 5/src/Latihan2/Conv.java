package Latihan2;

public class Conv{
    public static void main(String[] argv){
        Conv c = new Conv();
        String s = new String("ello");
        c.amethod(s);
    }
    public void amethod(String s){
        String c = String.valueOf('H');
        c += s;
        System.out.println(c);
    }
}