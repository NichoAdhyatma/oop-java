package latihan4;

public class Tes {
    public static void Proses(Pegawai peg) {
        if (peg instanceof Manajer) {
            Manajer man = (Manajer) peg;
            System.out.println("...lakukan tugas-tugas manajer...");
            System.out.println("Data Manajer : " + peg.getNama() + " Gaji " + peg.getGaji() + " Bonus: " + man.getBonus());
        } else if (peg instanceof Kurir) {
            Kurir kur = (Kurir) peg;
            System.out.println("...lakukan tugas-tugas kurir...");
            System.out.println("Data Kurir : " + peg.getNama() + " Gaji: " + peg.getGaji() + " Bonus: " + kur.getBonus());
        } else {
            System.out.println("...lakukan tugas-tugas lainnya");
            System.out.println("Data Pegawai : " + peg.getNama() + " Gaji " + peg.getGaji());
        }
    }

    public static void main(String args[]) {
        Manajer man = new Manajer("Pak Manager", 5000, 2000);
        Kurir kurir = new Kurir("Mas Kurir", 2000, 1000);
        Pegawai pegawai = new Pegawai("Bu Pegawai", 3000);
        Proses(man);
        Proses(kurir);
        Proses(pegawai);
    }
}