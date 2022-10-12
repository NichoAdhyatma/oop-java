package Tugas;

public class Programmer extends Pegawai{
    private int bonus;

    Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int infoGaji() {
        return super.infoGaji();
    }

    public int infoBonus() {
        return bonus;
    }
}