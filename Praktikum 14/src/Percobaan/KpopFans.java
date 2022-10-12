package Percobaan;

public class KpopFans extends Fans {
    public KpopFans() {
        super("noname");
    }

    public KpopFans(String name) {
        super(name);
    }

    public void watchingPerformance(Musician musician, String expression) {
        showName();
        System.out.print(expression + " Melihat idolnya ");
        musician.perform();
        System.out.println("");
    }
}