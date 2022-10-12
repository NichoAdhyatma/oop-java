package Tugas;

class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }
}