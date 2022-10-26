package latihan2;

public interface Scanner{

    public default void scaneImage(){
        System.out.println("Scanning image...");
    }
}