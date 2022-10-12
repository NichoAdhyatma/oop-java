package Percobaan;

public class Fans {
    private String name;

    public Fans() {
        this("noname");
    }

    public Fans(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.print(name + " : ");
    }

    public void watchingPerformance() {
        showName();
        System.out.println("Melihat idolnya dari youtube");
    }

    public void watchingPerformance(Musician musician) {
        showName();
        System.out.print("Melihat idolanya ");
        musician.perform();
        System.out.println("");
    }


}