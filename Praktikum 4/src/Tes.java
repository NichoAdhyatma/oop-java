public class Tes {
    public static void main(String[] args) {
        int[] arr = {1, 2};

        int[] arr2;

        arr2 = arr;
        arr2[0] = 9;

        System.out.print(arr[0]);
    }
}