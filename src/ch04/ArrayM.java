package ch04;

public class ArrayM {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menghitung jumlah angka-angka selisih yang ditampilkan pada point (i)\n");
        int selisih = 0;
        int jumlah=0;
        for (int x = 0; x < nilai.length - 1; x++) {
            if (nilai.length - 1 < nilai.length) {
                selisih = nilai[x] - nilai[x+1];
                jumlah+= selisih;
            }
            System.out.println("Angka Sebelumnya = " + nilai[x]);
            System.out.println("Angka Sesudah = " + nilai[x + 1]);
            System.out.println("Selisih menjadi = " + selisih);
            System.out.println();
        }
        System.out.println("Jumlah seluruh selisih = "+jumlah);
    }
}