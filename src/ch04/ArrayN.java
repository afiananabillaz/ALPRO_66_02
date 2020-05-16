package ch04;

public class ArrayN {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan jumlah angka-angka di dalam array dengan seluruh angka-angka sebelumnya\n");
        int jumlah = 0;
        System.out.print("Jumlah angka-angka di dalam array = ");
        for (int x = 0; x < nilai.length; x++) {
            jumlah += nilai[x];

            System.out.print(jumlah + " ");
            System.out.print("Seluruh angka sebelumnya = ");
            for (int y = 0; y < x; y++) {
                System.out.print(nilai[y] + "+");
            }
            System.out.println(nilai[x] + " ");
        }
    }
}

