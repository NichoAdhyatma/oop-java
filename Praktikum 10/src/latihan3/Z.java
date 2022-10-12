package latihan3;

public class Z extends X {
    Y y = new Y();

    Z() {
        System.out.print("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}