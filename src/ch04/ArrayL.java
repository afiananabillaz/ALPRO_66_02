package ch04;

public class ArrayL {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan jumlah angka dengan angka setelahnya yang hasil jumlahnya bernilai genap");
        int jumlah = 0;
        for (int x = 0; x < nilai.length; x++) {
            if (x < nilai.length - 1) {
                if (nilai[x] % 2 == 0 && nilai[x+1] % 2 == 0) {
                    jumlah = nilai[x] + nilai[x+1];
                    System.out.println("Angka Sebelum = " + nilai[x]);
                    System.out.println("Angka Sesudah = " + nilai[x+1]);
                    System.out.println("Jumlah = " + jumlah);
                    System.out.println();
                }
            }
        }
    }
}