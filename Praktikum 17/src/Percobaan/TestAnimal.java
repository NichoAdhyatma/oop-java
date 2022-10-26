package Percobaan;

public class TestAnimal {
    public static void main(String args[]){
        Binatang lovebird = new Burung();
        Binatang cat = new Mamalia();
        Mamalia dolphin = new Mamalia();
        lovebird.bernafas();
        lovebird.makan();
        lovebird.berkembangBiak();
        cat.bernafas();
        cat.makan();
        cat.berkembangBiak();
        dolphin.berkembangBiak();
    }
}