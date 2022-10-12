package Latihan4;

public class EqTest4 {
    public static void main(String[] argv) {
        EqTest4 e = new EqTest4();
    }

    EqTest4() {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("java");

        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        if (s1.equals(s3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

}