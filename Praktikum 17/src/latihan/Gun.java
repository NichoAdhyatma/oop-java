package latihan;

public class Gun extends Weapon {
    public int bullets;

    public Gun(int bullets) {
        this.bullets = bullets;
    }

    public void attack() {
        this.bullets--;
        System.out.println("Senjata \n" + "Menembak peluru \n" + "Sisa peluru : " + this.bullets);
    }

}