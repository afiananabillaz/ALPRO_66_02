package ch04;

public class ArrayC {
    public static void main(String[] args) {
        System.out.println("Menampilkan angka-angka ganjil pada array");
        System.out.print("Angka-angka ganjil= ");
        int[] nilai = {3,8,9,12,19,20,26,32,38,41,48,55,82};
        for (int x = 0; x < nilai.length; x++) {
            if (nilai[x] % 2 != 0) {
                System.out.print(nilai[x]+" ");
            }
        }
    }
}