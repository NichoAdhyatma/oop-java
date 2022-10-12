package Percobaan3;

class Str3{
    public static void main(String [] args){
        String str1 = "Monas";
        System.out.println("Str1 : " + str1);
        String str2 = "monas";
        System.out.println("Str2 : " + str2);
        String str3 = str1 + str2;
        System.out.println("Str3 : " + str3);
        String str4 = str1.concat(str2);
        System.out.println("Str4 : " + str4);
        str1 += str2;
        System.out.println("Str1 : " + str1);
    }
}