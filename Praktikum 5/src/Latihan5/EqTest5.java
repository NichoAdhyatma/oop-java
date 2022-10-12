package Latihan5;

public class EqTest5 {
    public static void main(String argv[]) {
        EqTest5 e = new EqTest5();
    }

    EqTest5() {

        String s = "Java";
        String s2 = "java";
        if (s.equalsIgnoreCase(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

}