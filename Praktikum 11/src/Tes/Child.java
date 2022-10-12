package Tes;

class Child extends Parent {

    void parent(int i) {
        System.out.println("Overloading from child with param : " + i);
    }

    void parent() {
        System.out.println("Overloading from child without param");
    }
}