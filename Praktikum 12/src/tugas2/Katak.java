package tugas2;

public class Katak {
     int umur;
     String nama;

     public Katak(int umur, String nama) {
         this.umur = umur;
         this.nama = nama;
     }

     public String caraBergerak() {
         return "melompat";
     }
}