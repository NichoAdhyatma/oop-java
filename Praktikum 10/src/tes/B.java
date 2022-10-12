package tes;

public class B extends A {

    public B() {
       super();
        super.b =100;
    System.out.println(super.b);

    }

    public static void main(String[] args) {
        new B();
    }
}