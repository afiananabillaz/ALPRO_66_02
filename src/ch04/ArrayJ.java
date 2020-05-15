package ch04;

public class ArrayJ {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan selisih angka-angka genap dengan angka setelahnya genap");
        int selisih = 0;
        for (int x = 0; x < nilai.length; x++) {
            if (nilai[x] % 2 == 0) {
                for (int y = x + 1; y < nilai.length; y++)
                    if (nilai[y] % 2 == 0) {
                        selisih = nilai[x] - nilai[y];
                        System.out.println("Angka Sebelum = " + nilai[x]);
                        System.out.println("Angka Sesudah = " + nilai[y]);
                        System.out.println("Selisih = " + selisih);
                        System.out.println();
                    }
            }
        }
    }
}