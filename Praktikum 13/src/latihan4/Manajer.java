package latihan4;

public class Manajer extends Pegawai {
    private int bonus;

    public Manajer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
}