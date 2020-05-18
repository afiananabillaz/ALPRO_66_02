package ch06;

public class AlgoritmaSelectionsort {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Mengurutkan nilai array dengan algoritma Selection Sort");
        System.out.print("Nilai array sebelum diurutkan: ");
        for(int a=0; a<nilai.length; a++){
            System.out.print(nilai[a]+" ");
        }
        for (int x = 0; x < nilai.length - 1; x++) {
            int terbesar = x;
            for (int y = x; y < nilai.length; y++) {
                if (nilai[terbesar] > nilai[y]) {
                    terbesar= y;
                }
            }
            int urutan_baru = nilai[x];
            nilai[x] = nilai[terbesar];
            nilai[terbesar] = urutan_baru;
        }
        System.out.println();
        System.out.print("Setelah di urutkan menjadi: ");
        for (int a=0; a <nilai.length; a++){
            System.out.print(nilai[a]+" ");
        }
    }
}