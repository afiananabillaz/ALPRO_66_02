package ch06;

public class AlgoritmaInsertionsort {
    public static void main(String[] args) {
        int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Mengurutkan nilai array dengan algoritma Insertion Sort");
        System.out.print("Nilai array sebelum diurutkan: ");
        for(int a=0; a<nilai.length; a++){
            System.out.print(nilai[a]+" ");
        }
        for (int x = 1; x < nilai.length; x++) {
            for (int y = x; y >= 1; y--) {
                if (nilai[y] > nilai[y - 1]) {
                    break;
                }
                int urutan_baru = nilai[y];
                nilai[y] = nilai[y - 1];
                nilai[y-1] = urutan_baru;
            }
        }
        System.out.println();
        System.out.print("Setelah di urutkan menjadi: ");
        for(int a = 0; a < nilai.length; a++){
            System.out.print(nilai[a]+" ");
        }
    }
}

