package Percobaan2;

class Str2{
    public static void main(String [] args){
        String str1 = new String("PENS");
        String str2 = str1;
        System.out.println(str1 == str2);
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
