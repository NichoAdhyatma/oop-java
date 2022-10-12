package Tugas1;

public class ArrPos {
    public int[][] arrayOfInts = {{32, 87, 3, 589}, {12, 1076, 2000, 8},
            {622, 127, 77, 955}};

    public void searchEl(int search) {
        for(int i = 0; i < arrayOfInts.length; i++) {
            for(int j = 0; j < arrayOfInts[0].length; j++) {
                if(arrayOfInts[i][j] == search) {
                    System.out.println(search + " Found at "+ i + ", " + j);
                    break;
                }
            }
        }
    }
}