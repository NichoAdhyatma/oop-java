package latihan2;

public class Truk {
    private double muatan;
    private double muatanmaks;

    public Truk(double beratmaks) {
        muatanmaks = kiloToNewts(beratmaks);
    }

    public double getMuatan() {
        return newtsToKilo(muatan);
    }

    public double getMuatanMaks() {
        return newtsToKilo(muatanmaks);
    }

    public boolean tambahMuatan(double berat) {
        double beratN = kiloToNewts(berat);
        if (beratN + muatan <= muatanmaks) {
            muatan += beratN;
            return true;
        }
        return false;
    }

    public double newtsToKilo(double berat) {
        return berat / 9.8;
    }

    public double kiloToNewts(double berat) {
        return berat * 9.8;
    }
}