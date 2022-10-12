public class Kendaraan {
    private int idVechile;
    private float discount = 0;
    public int capacity;
    public String merk;


    public Kendaraan(int id, float discount, int capacity, String merk ) {
        this.idVechile = id;
        this.discount = discount;
        this.capacity = capacity;
        this.merk = merk;
    }

    public int getIdVechile() {
        return idVechile;
    }

    public float getDiscount() {
        return discount;
    }

    public void setIdVechile(int id) {
        this.idVechile = id;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}

