package latihan3;

class Child extends Parent {
    private void method1() {
        System.out.println("Child's method1()");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.method2();
    }
}