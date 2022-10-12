package Tugas;

class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;

    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }

    public int getTarifAwal() {
        return tarifAwal;
    }

    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }

    public int getTarifPerKm() {
        return tarifPerKm;
    }
}