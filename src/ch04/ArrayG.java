package ch04;

public class ArrayG {
    public static void main(String[] args) {
        System.out.println("Menampilkan angka-angka kelipatan 5 pada array");
        System.out.print("Angka-angka kelipatan 5 =");
        int[] nilai = {3,8,9,12,19,20,26,32,38,41,48,55,82};
        for (int x = 0; x < nilai.length; x++) {
            if (nilai[x] % 5 == 0) {
                System.out.print(" "+nilai[x]);
            }
        }
    }
}

